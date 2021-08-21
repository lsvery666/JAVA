import java.io.*;
import java.net.*;
class TextClient
{
	public static void main(String[] args) throws Exception{
		
		Socket s = new Socket("192.168.56.1",10006);

		//�ļ��Ĵ����������ַ�������
		BufferedReader br = new BufferedReader(new FileReader("IPDemo.java"));

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		String line = null;
		
		//���ļ�
		while((line=br.readLine())!=null){

			//д��Socket�������
			out.println(line);

		}

		//out.close(); outһ�رգ�socketҲ��ر� װ����ģʽ 
		s.shutdownOutput();//�رտͻ��˵������ �൱�ڸ����м���һ���������-1
								 //��Ȼ����˵�readLineһֱ�ڵȴ�

		//��ȡ����˵ķ�����Ϣ
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

		//Socket��������
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//�ļ����ַ������
		PrintWriter out = new PrintWriter(new FileWriter("server.txt",true));

		String line = null;

		//��Socket��������
		while ((line = bufIn.readLine())!=null)
		{
			//д���ļ����ַ������
			out.println(line);
		}

		//Socket�������
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

		pw.println("�ϴ��ɹ�");

		out.close();

		s.close();

		ss.close();
	}
}