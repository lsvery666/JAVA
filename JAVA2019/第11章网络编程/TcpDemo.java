/*
	��ʾtcp����

	1.tcp�ֿͻ��˺ͷ����
	2.�ͻ��˶�Ӧ�Ķ�����Socket
	  ����˶�Ӧ�Ķ�����ServerSocket
	
*/

/*
	�ͻ��ˣ�ͨ������Socket���󣬷����ڸö�����ʱ���Ϳ���ȥ����ָ��������
	��Ϊtcp���������ӵģ������ڽ���socket����ʱ����Ҫ�з���˴��ڣ������ӳɹ���
	�γ�ͨ·���ڸ�ͨ���������ݵĴ��䡣

	���󣺸�����˷���һ���ı�����

	���裺
	1.����Socket���񣬲�ָ��Ҫ���ӵ������ͽӿ�
*/
import java.io.*;
import java.net.*;

class TcpClient
{
	public static void main(String[] args) throws Exception{
		
		//�����ͻ���Socket����ָ��Ŀ�������Ͷ˿�
		Socket s=new Socket("127.0.0.1",10003);

		//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е������
		OutputStream os=s.getOutputStream();

		os.write("TCP is coming.".getBytes());

		s.close();
	}
}

/*
	�����
	���󣺶���˵�������ݣ�����ӡ�ڿ���̨�ϡ�

	���裺
	1.��������˵�Socket����ͨ��ServerSocket��������һ���˿ڡ�
	2.��ȡ���ӹ����Ŀͻ��˶���ͨ��accept()������û�����Ӿͻ�ȣ������������������ʽ��
	3.�����������������ݣ���ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶��󣬲���ȡ���ÿͻ��˶���Ķ�ȡ������ȡ���ݡ�
	4.�رշ���ˡ�����ѡ��
*/
class TcpServer
{
	public static void main(String[] args) throws Exception{

		//��������˵�Socket����
		ServerSocket ss=new ServerSocket(10003);

		//ͨ��accept������ȡ���ӹ����Ŀͻ��˶���
		Socket s=ss.accept();

		String ip=s.getInetAddress().getHostAddress();

		System.out.print(ip+" is connected.");

		//��ȡ�ͻ��˷��͹��������ݣ���ôҪʹ�ÿͻ��˶���Ķ�ȡ������ȡ����
		InputStream in=s.getInputStream();

		byte[] buf=new byte[1024];

		int len=in.read(buf);

		System.out.println(new String(buf,0,len));

		s.close();//�رտͻ���
		ss.close();//�رշ����
	}
}