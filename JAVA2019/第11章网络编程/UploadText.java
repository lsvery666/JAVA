import java.io.*;
import java.net.*;
class TextClient
{
	public static void main(String[] args) throws Exception{
		
		Socket s = new Socket("192.168.56.1",10006);

		//文件的带缓冲区的字符输入流
		BufferedReader br = new BufferedReader(new FileReader("IPDemo.java"));

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String line = null;
		
		//读文件
		while((line=br.readLine())!=null){

			//写入Socket的输出流
			out.println(line);

		}

		//out.close(); out一关闭，socket也会关闭 装饰者模式 
		s.shutdownOutput();//关闭客户端的输出流 相当于给流中加入一个结束标记-1
								 //不然服务端的readLine一直在等待

		//获取服务端的返回信息
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bufIn.readLine();

		System.out.println(str);

		br.close();

		s.close();
		
	}
}

class TextServer
{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(10006);

		Socket s = ss.accept();

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip+" is connected!");

		//Socket的输入流
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//文件的字符输出流
		PrintWriter out = new PrintWriter(new FileWriter("server.txt",true));

		String line = null;

		//读Socket的输入流
		while ((line = bufIn.readLine())!=null)
		{
			//写入文件的字符输出流
			out.println(line);
		}

		//Socket的输出流
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

		pw.println("上传成功");

		out.close();

		s.close();

		ss.close();
	}
}