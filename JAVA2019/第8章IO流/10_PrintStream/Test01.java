/*
	java.io.printStream ��׼���������Ĭ�ϴ�ӡ������̨�����ֽڷ�ʽ
	java.io.printWriter ���ַ���ʽ
*/
import java.util.*;
import java.text.*;
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		System.out.println("HelloWorld");

		PrintStream ps = System.out;
		ps.println("JAVA....");

		//���Ըı��������
		System.setOut(new PrintStream(new FileOutputStream("log")));//log��־�ļ�
		
		//�ٴ����
		//System.out.println("HAHA");

		//ͨ��ʹ����������ַ�ʽ��¼��־
		//���󣺼�¼��־��m1������ʼִ�е�ʱ��ͽ�����ʱ�䣬��¼��log�ļ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

		System.out.println("m1������ʼִ��ʱ�䣺"+sdf.format(new Date()));
		m1();
		System.out.println("m1��������ʱ�䣺"+sdf.format(new Date()));
	}
	public static void m1(){}
}