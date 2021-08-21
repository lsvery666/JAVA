import java.net.*;
import java.io.*;
class TcpClient2
{
	public static void main(String[] args) throws Exception{

		Socket s=new Socket("192.168.56.1",10004);

		OutputStream os=s.getOutputStream();
		
		os.write("Nihao".getBytes());

		//os.close(); 使用close()方法关闭流时，流一关闭 Socket也会跟着关闭
		

		InputStream in=s.getInputStream();

		byte[] buf=new byte[1024];

		
		int len=in.read(buf);


		System.out.println(new String(buf,0,len));
		
	
		s.close();
	}
}
class TcpServer2
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(10004);

		Socket s=ss.accept();

		String ip=s.getInetAddress().getHostAddress();

		System.out.println(ip+" is connected！");


		InputStream in=s.getInputStream();

		byte[] buf=new byte[1024];

		int len=in.read(buf);

		System.out.println(new String(buf,0,len));


		Thread.sleep(2000);

		OutputStream os=s.getOutputStream();

		os.write("收到，你也好！".getBytes());

		s.close();

		ss.close();
	}
}