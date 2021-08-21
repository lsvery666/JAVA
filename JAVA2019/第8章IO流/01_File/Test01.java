/*
	java.io.File;
	File������޹أ�����ͨ����������ļ��Ķ���д
	File���ļ���Ŀ¼·�����ĳ����ʾ��ʽ
	Fileֻ���ļ���Ŀ¼��·��������������ʵ���ļ�
	�磺E:\ѧϰ\JAVA\����\��8��IO��\File  Ŀ¼
		E:\ѧϰ\JAVA\����\��8��IO��\File\Test01.java  �ļ�
	File�������Ӳ���ϵ�Directory��file
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		
		File f1 = new File("Test01.java");
		File f2 = new File("D:\\Lisen\\JAVA\\����\\��8��IO��\\01_File\\Test01.java");
		File f3 = new File("D:\\Lisen\\JAVA\\����\\��8��IO��\\01_File");

		System.out.println(f1.exists());//true
		System.out.println(f2.exists());//true
		System.out.println(f3.exists());//true

		File f4 = new File("�ļ���/temp");
		System.out.println(f4.exists());//false
		
		//�������������Ŀ¼����ʽ����
		if(!f4.exists()){
			f4.mkdir();
		}
		
		//����������򴴽��ļ�
		if(!f4.exists()){
			f4.createNewFile();
		}
		//���������Ѿ�������һ��"temp"���ļ��У�����f4.exists()Ϊtrue�����ٴ���temp�ļ�
		
		/* ����
		File f5 = new File("�ļ���\\temp");
		if(!f5.exists()){
			f5.createNewFile();
		}
		�ɼ�createNewFile()ֻ�����Ѵ��ڵ�Ŀ¼�´����ļ������ܴ��� �����ڵ��ļ����µ� �ļ�
		*/

		File f6 = new File("D:/Lisen/JAVA/����/��8��IO��/01_File/a/b/c/d");
		//����������򴴽�����·��
		if(!f6.exists()){
			f6.mkdirs();
		}

	}
}
