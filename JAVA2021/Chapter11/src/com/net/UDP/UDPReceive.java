package com.net.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
	需求：定义一个应用程序，用于接受UDP协议传输的数据并处理的

	思路：
	1.定义UDPSocket服务,通常会监听一个端口，其实就是给这个接受网络应用程序定义一个数字标识，方便于明确哪些数据过来可以应用程序进行处理。
	2.定义一个数据包，因为要存储接受到的数据
	3.通过socket服务的receive方法将收到的数据存入已定义好的数据包中
	4.通过数据包对象的功能，将数据取出
	5.关闭资源
*/

public class UDPReceive {
    public static void main(String[] args) throws Exception {

        //创建udpsocket服务，建立端点
        DatagramSocket ds = new DatagramSocket(10000);//这句话不能放到while循环里，会出现Exception in thread "main" java.net.BindException: Address already in use: Cannot bind

        while (true) {
            //定义数据包。用于存储数据
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            //通过服务的receive方法将收到的数据存入数据包中
            ds.receive(dp);//阻塞式方法

            //通过数据包的方法获取其中的数据
            String ip = dp.getAddress().getHostAddress();

            String data = new String(dp.getData(), 0, dp.getLength());//dp.getLength()获取有效长度

            int port = dp.getPort();

            System.out.println(ip + "::" + port + ": " + data);
        }
        //关闭资源
        //ds.close();

    }
}