/*
	�����쳣�ķ�ʽһ��throws �쳣����,�쳣����,...
	ʹ��throws�����쳣�������������쳣������ж����
	˭���õľͻ��׸�˭
*/
import java.io.*;
public class ThrowsTest{
	public static void main(String[] args) throws FileNotFoundException{//�������׾ͻ������쳣�׸�JVM����ִ�й����б���
		m1();
		
		//ִ�й����У���������m1()��������������쳣��������䲻��ִ�С�
		System.out.println("�ļ�������");
	} 
	public static void m1() throws FileNotFoundException{
		m2();
	}
	public static void m2() throws FileNotFoundException{
		m3();
	}
	public static void m3()  throws FileNotFoundException{
		new FileInputStream("ab.txt");	//FileInputStream���췽������λ����ʹ��throws(������)
	}
}
/*
	�ڳ������й����з�����FileNotFoundException���͵��쳣
	JVMΪ���Ǵ�����һ��FileNotFoundException���͵Ķ���
	�ö���Я��������Ϣ��
	JVM���𽫸ö������Ϣ��ӡ������̨�����˳�����
	Exception in thread "main" java.io.FileNotFoundException: ab.txt (ϵͳ�Ҳ���ָ�����ļ���)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
        at ThrowsTest.m3(ThrowsTest.java:21)
        at ThrowsTest.m2(ThrowsTest.java:18)
        at ThrowsTest.m1(ThrowsTest.java:15)
        at ThrowsTest.main(ThrowsTest.java:9)
*/