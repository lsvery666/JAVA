/*
	��ʾ�ͻ��˺ͷ����

   1	�ͻ��ˣ������
		����ˣ��Զ���

	//	GET / HTTP/1.1                                                                          //����������������GET���� ������һ����ַ����:/myweb/demo.html  HTTP/1.1��HTTPЭ��汾
	//	Accept: text/html, application/xhtml+xml, 															 //��������Խ��յ��ļ� 
	//	Accept-Language: zh-CN																						 //��������Խ��յ�����	
	//	User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko			 //�ͻ�����Ϣ
	//																														 //����
	//	Accept-Encoding: gzip, deflate																			 //���Խ��յ�ѹ�����뷽ʽ
	//	Host: 192.168.56.1:11000																					 //�����Ҫ���ʵ������Ͷ˿�
	//	DNT: 1
	//	Connection: Keep-Alive
	//																														 //���У��ÿ������ϴ���HTTP������Ϣͷ���������´���HTTP������Ϣ��
	//
	//

/*
	2	�ͻ��ˣ������
		����ˣ�tomcat������

	3  �ͻ��ˣ�windows �� telnet �ͻ��� ͨ�������� telnet 192.168.56.1 11000 ������
		����ˣ��Զ���

*/
import java.io.*;
import java.net.*;


class ServerDemo
{
	public static void main(String[] args) throws Exception
	{
		//�����
		ServerSocket ss=new ServerSocket(11000);

		//�ͻ���
		Socket s=ss.accept();

		System.out.println(s.getInetAddress().getHostAddress());

		//�鿴�ͻ��˷��͹��������ݵ�����ʲô
		InputStream in = s.getInputStream();

		byte[] buf = new byte[1024];

		int len = 0;

		while((len=in.read(buf))!=-1){

			System.out.println(new String(buf,0,len));
		
		}

		System.out.println("׼����ͻ��˷�������");

		//��ͻ��˷�������
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		out.println("<font color='red' size='7'>�ͻ������</font>");

		s.shutdownOutput();

		s.close();

		ss.close();
	}
}

	
