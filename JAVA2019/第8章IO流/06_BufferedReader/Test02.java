/*
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test02.java")));
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		/*

		//�������л��������ַ�������
		FileInputStream fis = new FileInputStream("Test02.java");//�ļ��ֽ�������
	
		//ת���������ֽ���ת�����ַ�����
		InputStreamReader isr = new InputStreamReader(fis);//isr���ַ���

		BufferedReader br = new BufferedReader(isr);//isr���Ը�Reader����

		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test02.java")));

		//��ʼ��
		String temp = null;
		while((temp=br.readLine())!=null){
			System.out.println(temp);
		}

		br.close();
	}
}