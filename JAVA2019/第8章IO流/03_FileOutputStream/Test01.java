/*
	java.io.*
		java.io.FileOutputStream;�ļ��ֽ������
		��������ڴ��е�����д��Ӳ���ļ���
	
	fos.write(bytes[], start, end)	[start, end)
	fos.flush()
	fos.close()
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args){
		FileOutputStream fos = null;
		try{
			//fos = new FileOutputStream("temp02");
			//����ķ�ʽ����ʹ�ã��ὫԴ�ļ�����
			
			//��׷�ӵķ�ʽд��
			fos = new FileOutputStream("temp02", true);

			//��ʼд
			String msg = "HelloWorld";
			//��String����ת����byte����
			byte[] bytes = msg.getBytes();

			//��byte�����ȫ������д��
			//fos.write(bytes);
			//��byte�����һ��������д��
			fos.write(bytes,0,3);
			
			//����ʱ��Ϊ�˱�֤������ȫд��Ӳ�̣�����Ҫˢ��
			fos.flush();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try{
					fos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		

	}
}