/*
	����һ��
	����ʱװ��
*/
import java.io.*;
import java.util.*;
import java.text.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//�������Զ���
		Properties p=new Properties();

		FileReader fr=new FileReader("classInfo.properties");

		p.load(fr);

		fr.close();

		String className=p.getProperty("className");

		Class c=Class.forName(className);
		
		Object o=c.newInstance();

		System.out.println(o);

	}
}