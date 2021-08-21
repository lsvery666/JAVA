/*
	java.io.*;
		java.io.InputStreamReader;ת�������ֽ�������ת��Ϊ�ַ���������
			java.io.FileReader;�ļ��ַ�������
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args){
		FileReader fr=null;
		try
		{
			//�����ļ��ַ�������
			fr = new FileReader("����.txt");
			//��ʼ��
			char[] chars = new char[512];//1KB
			int temp = 0;
			while((temp=fr.read(chars))!=-1){
				System.out.println("length:"+temp+", "+new String(chars,0,temp));
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try
				{
					fr.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}