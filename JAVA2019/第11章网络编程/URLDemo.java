import java.io.*;
import java.net.*;

class URLDemo
{
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://192.168.1.112/Myweb/demo.html?name=haha&&age=30"); 

		System.out.println("getProtocol():"+url.getProtocol());

		System.out.println("getHost():"+url.getHost());

		System.out.println("getPort():"+url.getPort());

		System.out.println("getPath():"+url.getPath());

		System.out.println("getFile():"+url.getFile());

		System.out.println("getQuery():"+url.getQuery());

		/*
		int port = getPort();

		if(port==-1){

			port = 80;
		}
		*/
	}
}