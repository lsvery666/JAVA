/*
	HashMapĬ�ϳ�ʼ��������16��Ĭ�ϼ�������0.75
	HashtableĬ�ϳ�ʼ��������11��Ĭ�ϼ�������0.75
	java.util.Properties;Ҳ����key��value��ɣ�����key��value�����ַ�������
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		Properties p=new Properties();
		//key�����ظ�������ظ���value����
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