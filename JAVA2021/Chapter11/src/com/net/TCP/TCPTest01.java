package com.net.TCP;

/*
	演示tcp传输

	1.tcp分客户端和服务端
	2.客户端对应的对象是Socket
	  服务端对应的对象是ServerSocket

*/

/*
	客户端，通过查阅Socket对象，发现在该对象建立时，就可以去连接指定主机。
	因为tcp是面向连接的，所以在建立socket服务时，就要有服务端存在，并连接成功。
	形成通路后，在该通道进行数据的传输。

	需求：给服务端发送一个文本数据

	步骤：
	1.创建Socket服务，并指定要连接的主机和接口
*/

import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String[] args) throws Exception {

        //创建客户端Socket服务。指定目的主机和端口
        Socket s = new Socket("127.0.0.1", 10003);

        //为了发送数据，应该获取Socket流中的输出流
        OutputStream os = s.getOutputStream();

        os.write("TCP is coming.".getBytes());

        s.close();
    }
}

/*
	服务端
	需求：定义端点接受数据，并打印在控制台上。

	步骤：
	1.建立服务端的Socket服务，通过ServerSocket，并监听一个端口。
	2.获取连接过来的客户端对象。通过accept()方法。没有连接就会等，所以这个方法是阻塞式的
	3.服务端如果发过来数据，那么服务端要使用对应的客户端对象，并获取到该客户端对象的读取流来读取数据。
	4.关闭服务端。（可选）
*/
class TCPServer {
    public static void main(String[] args) throws Exception {

        //建立服务端的Socket服务
        ServerSocket ss = new ServerSocket(10003);

        //通过accept方法获取连接过来的客户端对象
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();

        System.out.println(ip + " is connected.");

        //获取客户端发送过来的数据，那么要使用客户端对象的读取流来读取数据
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf, 0, len));

        s.close();//关闭客户端
        ss.close();//关闭服务端
    }
}
