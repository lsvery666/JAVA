/*
	URLConnection��Ӧ�ò�
	Socket�ڴ����
	URLConnectionʵ���ǽ�Ӧ�ò�Э���Socket��װ��һ�����
	����:HttpURLConnection JarURLConnection
*/

import java.io.*;
import java.net.*;

class URLConnectionDemo
{
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://192.168.1.112:8080/Myweb/demo.html");

		URLConnection conn = url.openConnection();

		System.out.println(conn);
		
		InputStream in = conn.getInputStream();//���ص�����û����http��Ӧͷ ��Ϊ��Ӧ�ò�����˲�� 
		
		byte[] buf = new byte[1024];

		System.out.println("��ȡ����");

		int len = in.read(buf);

		System.out.println(new String(buf,0,len)); 
	}
}