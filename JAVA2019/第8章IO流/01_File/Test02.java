import java.io.*;
import java.util.*;
import java.text.*;
/*
	File���ó�Ա������
		boolean exists()
		boolean isDirectory()
		boolean isFile()
		long lastModified()
		long length()
		Files[] listFiles()
		String getAbsolutePath()
		String getParent()
		void mkdir()
		void mkdirs()
		void createNewFile()
*/
public class Test02
{
	public static void main(String[] args) throws Exception{
		//1.��ȡ����·��
		File f1 = new File("Test02.java");
		System.out.println(f1.getAbsolutePath());	// D:\Lisen\JAVA\����\��8��IO��\01_File\Test02.java

		//2.��ȡ�ļ���
		System.out.println(f1.getName());	// Test02.java

		//��ȡ��·�� �൱��..
		System.out.println(f1.getParent());//null

		File f2 = new File("D:\\Lisen\\JAVA\\����\\��8��IO��\\01_File\\Test02.java");
		System.out.println(f2.getParent());//D:\Lisen\JAVA\����\��8��IO��\01_File

		//�жϸ�File��Ŀ¼�����ļ�
		System.out.println(f1.isDirectory());//false
		System.out.println(f2.isFile());//true

		//��ȡ�ļ����һ���޸�ʱ��
		Date t = new Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));

		//��ȡ�ļ��ĳ���(�ֽ���)
		System.out.println(f1.length());

		//�г���ǰ·���µ�����·��������Directory��File
		File f3 = new File("D:\\Lisen\\JAVA\\����");
		File[] files = f3.listFiles();
		for(File f:files){
			System.out.println(f.getAbsolutePath());
		}
	}
}