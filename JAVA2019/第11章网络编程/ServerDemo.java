/*
	演示客户端和服务端

   1	客户端：浏览器
		服务端：自定义

	//	GET / HTTP/1.1                                                                          //浏览器向服务器发送GET请求 后面是一个地址，如:/myweb/demo.html  HTTP/1.1是HTTP协议版本
	//	Accept: text/html, application/xhtml+xml, 															 //浏览器可以接收的文件 
	//	Accept-Language: zh-CN																						 //浏览器可以接收的语言	
	//	User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko			 //客户端信息
	//																														 //空行
	//	Accept-Encoding: gzip, deflate																			 //可以接收的压缩编码方式
	//	Host: 192.168.56.1:11000																					 //浏览器要访问的主机和端口
	//	DNT: 1
	//	Connection: Keep-Alive
	//																														 //空行，该空行以上代表HTTP请求消息头，空行以下代表HTTP请求消息体
	//
	//

/*
	2	客户端：浏览器
		服务端：tomcat服务器

	3  客户端：windows 的 telnet 客户端 通过命令行 telnet 192.168.56.1 11000 来访问
		服务端：自定义

*/
import java.io.*;
import java.net.*;


class ServerDemo
{
	public static void main(String[] args) throws Exception
	{
		//服务端
		ServerSocket ss=new ServerSocket(11000);

		//客户端
		Socket s=ss.accept();

		System.out.println(s.getInetAddress().getHostAddress());

		//查看客户端发送过来的数据到底是什么
		InputStream in = s.getInputStream();

		byte[] buf = new byte[1024];

		int len = 0;

		while((len=in.read(buf))!=-1){

			System.out.println(new String(buf,0,len));
		
		}

		System.out.println("准备向客户端发送数据");

		//向客户端发送数据
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		out.println("<font color='red' size='7'>客户端你好</font>");

		s.shutdownOutput();

		s.close();

		ss.close();
	}
}

	
