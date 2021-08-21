/*
	URLConnection在应用层
	Socket在传输层
	URLConnection实际是将应用层协议和Socket封装在一起的类
	子类:HttpURLConnection JarURLConnection
*/

import java.io.*;
import java.net.*;

class URLConnectionDemo
{
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://192.168.1.112:8080/Myweb/demo.html");

		URLConnection conn = url.openConnection();

		System.out.println(conn);
		
		InputStream in = conn.getInputStream();//返回的流中没有了http响应头 因为在应用层进行了拆包 
		
		byte[] buf = new byte[1024];

		System.out.println("获取到流");

		int len = in.read(buf);

		System.out.println(new String(buf,0,len)); 
	}
}