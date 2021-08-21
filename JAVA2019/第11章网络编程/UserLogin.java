/*
	�ͻ���ͨ������¼���û���
	����˶�����û�������У��

	������û����ڣ��ڷ������ʾ xxx �ѵ�¼
	���ڿͻ�����ʾ xxx ��ӭ����

	������û������ڣ��ڷ������ʾ xxx ���Ե�½
	���ڿͻ�����ʾ xxx ���û�������

	���͵�½����

*/
import java.io.*;
import java.net.*;

//�ͻ���
class LoginClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.56.1",10008);

		//����¼���������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Socket���ַ������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//Socket���ַ�������
		BufferedReader	bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		for (int x=0;x<3 ;x++ )
		{
			String line = br.readLine();
			
			if(line.length()==0){//����û�ֱ�Ӱ��»س�
				
				if(x!=2){
				System.out.println("�������û�����������"+(2-x)+"�λ��ᣡ");
				}else{
					System.out.println("�������λ��������꣬�޷���½��");
				}

				continue;
			}
			
			if(line==null)
			{		
				System.out.println("���ѷ�����¼��ϵͳ�˳���");

				out.println("-1");

				break;
			}

			//���û�����д��Socket���ַ������
			out.println(line);

			//��ȡ����˵ķ�����Ϣ
			String info = bufIn.readLine();

			System.out.println("info:"+info);

			if(info.contains("��ӭ"))
				break;
		}

		br.close();

		s.close();
	}
}

//�����
class LoginServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10008);

		while(true){
			
			Socket s = ss.accept();

			String ip = s.getInetAddress().getHostAddress();

			System.out.println(ip+" is connected!");

			new Thread(new UserThread(s)).start();
		}
	}
}

//�û��߳�
class UserThread implements Runnable
{
	private final Socket s;

	private final String ip;

	UserThread(Socket s){

		this.s = s;

		ip = s.getInetAddress().getHostAddress();

	}

	public void run(){

		try
		{
			for (int x=0; x<3; x++)
			{
				//�ͻ��˵�������
				BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

				//�ͻ��˵������
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
				
				//�ͻ������������
				String name = bufIn.readLine();

				if("-1".equals(name)){

					System.out.println(ip+"�ѷ�����¼��");

					break;
				}

				//���ļ�User.txt
				BufferedReader br = new BufferedReader(new FileReader("User.txt"));
				
				//�жϸ��û����Ƿ����
				String line = null;

				boolean isExist = false;

				while((line=br.readLine())!=null){
					
					if(line.equals(name)){

						isExist = true;

						break;
					}
				}
				
				//�������
				if(isExist){

					System.out.println(name + ",�ѵ�¼");

					//��ͻ��˷�������
					pw.println(name + ",��ӭ����");
						
					break;

				}else{
				//���������

					if(name!=null){
						System.out.println(name + ",���Ե�½");
					}

					if(x!=2){

						pw.println("���û������ڣ������������û�����������"+(2-x)+"�λ��ᣡ");

					}else{

						System.out.println(ip+"���λ�����ʹ�ã���¼ʧ�ܣ�");

						pw.println("���û������ڣ����ѳ������Σ����ɵ�½��");
					}
					
				}
			}

			s.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(ip+"��½ʧ��");
		}
	}
}