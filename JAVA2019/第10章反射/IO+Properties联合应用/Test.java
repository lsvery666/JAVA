/*
	关于IO和Properties联合应用

	dbinfo这样的文件我们称作配置文件
	配置文件的作用就是：使程序更加灵活

	一般在程序中可变的东西不要写死，推荐写到配置文件中
	运行同样的程序得到不同的结果

	像dbinfo这样一个具有特殊内容的配置文件我们又叫做属性文件
	java规范中要求属性文件以.properties结尾

	属性文件中数据要求：
		key和value之间可以用"=",":"," "来连接
		如果" "，"=",":"都有，按最前面的作为分隔符
*/
import java.io.*;
import java.util.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//1.创建属性对象
		Properties p=new Properties();//和Map一样，只不过key和value只能存储字符串类型
												//key不能重复，如果重复则value覆盖

		//2.创建输入流
		FileInputStream fis=new FileInputStream("dbinfo.properties");
		
		//将fis流中的所有数据加载到属性对象中
		//3.加载
		p.load(fis);
		fis.close();
		String v=p.getProperty("username");
		System.out.println(v);
	}
}