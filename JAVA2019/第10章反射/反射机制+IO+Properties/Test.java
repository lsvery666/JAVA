/*
	编译一次
	运行时装配
*/
import java.io.*;
import java.util.*;
import java.text.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//创建属性对想
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