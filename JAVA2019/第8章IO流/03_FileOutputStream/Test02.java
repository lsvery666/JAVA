/*
	�����ļ��ĸ���ճ��
	FileInputStream���ܶ�ȡ�ļ��У�ֻ�ܶ�ȡ�ļ�
	FileOutputStreamʵ����ʱ�����Ŀ���ļ������ڣ����Զ��������������Զ����� �����ڵ��ļ����µ� �ļ���Ҳ�����Զ������ļ���
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("����.txt");//FileInputStream fis=new FileInputStream("�ļ���"); ����
		FileOutputStream fos = new FileOutputStream("copy.txt");//FileOutputStream fos=new FileOutputStream("�����ڵ��ļ���\\copy.txt"); ����
		byte[] bytes = new byte[1024];
		int temp = 0;
		// �߶���д
		while((temp=fis.read(bytes))!=-1){
			fos.write(bytes,0,temp);
		}
		fos.flush();
		
		fis.close();
		
		fos.close();
	}
}