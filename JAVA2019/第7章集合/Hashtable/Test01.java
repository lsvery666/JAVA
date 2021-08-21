/*
	HashMap默认初始化容量是16，默认加载因子0.75
	Hashtable默认初始化容量是11，默认加载因子0.75
	java.util.Properties;也是由key和value组成，但是key和value都是字符串类型
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		Properties p=new Properties();
		//key不能重复，如果重复则value覆盖
		p.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		p.setProperty("username","scott");
		p.setProperty("passage","tiger");
		String s1=p.getProperty("driver");
		String s2=p.getProperty("username");
		String s3=p.getProperty("passage");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
}