/*
	�����ϴ�ͼƬ

*/
import java.io.*;
import java.net.*;

class PicClient
{
	public static void main(String[] args) throws Exception{

		//�ͻ����ϴ�ͼƬ����ʾ��Ϣ
		if(args.length!=1){
			System.out.println("��ѡ��һ��Jpg��ʽ��ͼƬ��");
			return;
		}

		File file = new File(args[0]);

		if(!file.exists() || !file.isFile()){
			System.out.println("��·�������ڻ���һ���ļ�");
			return;
		}

		if(!file.getName().endsWith(".jpg")){
			System.out.println("�ļ���ʽ����,��ѡ��jpg��ʽͼƬ");
			return;
		}

		if(file.length()>1024*1024*8 || file.length()<1024*1024*3){
			System.out.println("��ѡ��һ����С��3MB~8MB֮���ͼƬ");
			return;
		}
		
		Socket s = new Socket("192.168.56.1",10007);

		//�ļ���������
		FileInputStream fis = new FileInputStream(file);
		
		//Socket�������
		OutputStream os = s.getOutputStream();

		//һ�߶�һ��д
		byte[] buf = new byte[1024];

		int len = 0;

		while((len=fis.read(buf))!=-1){

			os.write(buf,0,len);

		}

		//������־
		s.shutdownOutput();

		//Socket��������
		InputStream in = s.getInputStream();

		byte[] buf2 = new byte[1024];

		int len2 = in.read(buf2);

		System.out.println(new String(buf2,0,len2));

		fis.close();

		s.close();
	}
}

//���������и�����
//��һ���ͻ���������ʱ�����������ִ����Ӧ���߼�ʱ����Ŀͻ����޷���������
//��Ҫ���̼߳���
class PicThread implements Runnable
{

	private final Socket s;

	private String ip;

	public PicThread(Socket s){

		this.s = s;
	}

	public void run(){

		int count = 1;
		
		try
		{
			ip = s.getInetAddress().getHostAddress();

			System.out.println(ip+" is connected!");

			//Socket��������
			InputStream in = s.getInputStream();

			File file = new File(ip+"("+(count++)+")"+".jpg");

			while(file.exists())
				file = new File(ip+"("+(count++)+")"+".jpg");

			//�ļ��������
			FileOutputStream fos = new FileOutputStream(file);

			//һ�߶�һ��д
			byte[] buf = new byte[1024];

			int len = 0;

			while((len=in.read(buf))!=-1){

				fos.write(buf,0,len);

			}

			//Socket�������
			OutputStream os = s.getOutputStream();

			os.write("�ϴ��ɹ���".getBytes());

			fos.close();

			s.close();
		}
		catch (Exception e)
		{
			throw new RuntimeException(ip+"�ϴ�ʧ��");
		}

	}
}

class PicServer
{
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(10007);
		while(true)
		{
			Socket s = ss.accept();

			new Thread(new PicThread(s)).start();
		}

		//ss.close();

	}
}