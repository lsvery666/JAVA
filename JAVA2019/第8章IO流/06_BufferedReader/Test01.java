/*
	BufferedReader;���л��������ַ�������
	BufferedReader(FileReader fr)
	String readLine()
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//����һ�����л��������ַ�������
		FileReader fr = new FileReader("Test01.java");//����һ���ļ��ַ�������
		BufferedReader br = new BufferedReader(fr);//���ļ��ַ���������װ�ɴ��л��������ַ�������
		//���������ֵ�λ�ã����ֿ��Է�Ϊ����װ��(Ҳ�д�����)�ͽڵ���
		//FileReader fr��һ���ڵ���
		//BufferedReader br��һ����װ�����ߴ�����

		//��ʼ��
		//br.readLine()������ȡһ�У�������β�������з�
		//�����Ϊʲôͨ��Ҫ�ڴ����ļ������һ�п�һ��
		String temp = null;
		while((temp=br.readLine())!=null){
			System.out.println(temp);
		}

		//�ر�
		//ע�⣺�رյ�ʱ��ֻ��Ҫ�ر������İ�װ������һ�����ģʽ������װ����ģʽ��
		br.close();
		
	}
}