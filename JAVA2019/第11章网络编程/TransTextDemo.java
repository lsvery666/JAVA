/*
	���󣺽���һ���ı�ת��������
	�ͻ��˸�����˷����ı�������˻Ὣ�ı�ת���ɴ�д�ٷ��ظ��ͻ���
	���ҿͻ��˿��Բ��ϵĽ����ı�ת�������ͻ�������overʱ��ת������

	������
		�ͻ��ˣ�
			��Ȼ�ǲ����豸�ϵ����ݣ���ô�Ϳ���ʹ��io������������io�Ĳ���������˼��
			Դ������¼��
			Ŀ�ģ������豸�������������
			���Ҳ��������ı����ݣ�����ѡ���ַ���

	���裺
	�ٽ�������
	�ڻ�ȡ����¼��
	�۽����ݷ��������
	�ܻ�ȡ����˷��صĴ�д����
	�ݽ������ر���Դ

	���Ҷ����ı����ݣ�����ʹ���ַ������в�����ͬʱ���Ч�ʣ����뻺�塣
*/
import java.net.*;
import java.io.*;
class TransClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("192.168.56.1",10005);

		//����¼��
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		//�ͻ��˵������
		BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		//�ͻ��˵�������
		BufferedReader	bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;

		while((line=br.readLine())!=null){
	
			if("over".equals(line))
			{
				break;
			}
			
			//����д���˻�����
			bufOut.write(line);

			//readLine�Ľ�����־��"/n"����line����û��"/n"�������Ҫ�Ӹ����з�������˵�readLine���ܶ�����Ϣ
			bufOut.newLine();

			//���뽫����������Ϣˢ�µ�������
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
	�����ӳ��ֵ����⣺
	���󣺿ͻ��˺ͷ���˶���Ī���ĵȴ�
	Ϊʲô�أ�
	��Ϊ�ͻ��˺ͷ���˶�������ʽ��������Щ������û�ж���������ǡ���ô��һֱ�ȡ�
*/