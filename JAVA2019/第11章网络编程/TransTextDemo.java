/*
	需求：建立一个文本转换服务器
	客户端给服务端发送文本，服务端会将文本转换成大写再返回给客户端
	而且客户端可以不断的进行文本转换。当客户端输入over时，转换结束

	分析：
		客户端：
			既然是操作设备上的数据，那么就可以使用io技术，并按照io的操作规律来思考
			源：键盘录入
			目的：网络设备，网络输出流。
			而且操作的是文本数据，可以选择字符流

	步骤：
	①建立服务
	②获取键盘录入
	③将数据发给服务端
	④获取服务端返回的大写数据
	⑤结束，关闭资源

	而且都是文本数据，可以使用字符流进行操作，同时提高效率，加入缓冲。
*/
import java.net.*;
import java.io.*;
class TransClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("192.168.56.1",10005);

		//键盘录入
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		//客户端的输出流
		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		//客户端的输入流
		BufferedReader	bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;

		while((line=br.readLine())!=null){
	
			if("over".equals(line))
			{
				break;
			}
			
			//数据写入了缓冲区
			bufOut.write(line);

			//readLine的结束标志是"/n"，而line本身没有"/n"，因此需要加个换行符，服务端的readLine才能读出信息
			bufOut.newLine();

			//必须将缓冲区的信息刷新到流里面
			bufOut.flush();

			String str=bufIn.readLine();

			System.out.println("Server:"+str);
		}
	
		br.close();

		s.close();
	}
}

class TransServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(10005);
		
		Socket s = ss.accept();

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip+" is connected!");

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String str = null;

		while((str=bufIn.readLine())!=null){

			out.println(str.toUpperCase());

			//bufOut.write(str.toUpperCase());

			//bufOut.newLine();
		
			//bufOut.flush();
		}

		s.close();

		ss.close();
	}
}
/*
	该例子出现的问题：
	现象：客户端和服务端都在莫名的等待
	为什么呢？
	因为客户端和服务端都有阻塞式方法。这些方法都没有读到结束标记。那么就一直等。
*/