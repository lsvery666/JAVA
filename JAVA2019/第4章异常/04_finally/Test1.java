/*
	1.finally�������ֱ�Ӻ�try�������� try...finally... ��ִ��try��ִ��finally
	2.try...catch...finallyҲ����
	3.��finally�����еĴ�����һ����ִ�еģ�try�е�returnҲ�޷����
	4.ֻ�г�����ִ��finally֮ǰ�˳���JVM���������������δͨ����System.exit(0)��finally����Ų���ִ��
	5.finally�����ã���Ҫ�û��ر���Դ�������Ƿ����쳣����Դ��������йرա�
*/
import java.io.*;
public class Test1{
	public static void main(String[]	args){
		/*����ͨ��
		try{
			System.out.println("ABC");
			return;
		}finally{
			//ִ��
			System.out.println("Test");
		}
		*/
		
		/*���벻ͨ��
		try{
			FileInputStream fis=new FileInputStream("abc.java");
			
			System.out.println("TTT");
			
		}finally{
			
			System.out.println("AAA");
		}
		*/
		
		/*main()�����throws FileNotFoundException
		try{
			FileInputStream fis=new FileInputStream("abc.java");

			//��ִ��
			System.out.println("TTT");
			
		}finally{

			//ִ��
			System.out.println("AAA");

		}
		����ͨ��
		���н��Ϊ��
			AAA
			Exception in thread "main" java.io.FileNotFoundException: abc.java (ϵͳ�Ҳ���ָ�����ļ���)
			at java.base/java.io.FileInputStream.open0(Native Method)
			at java.base/java.io.FileInputStream.open(Unknown Source)
			at java.base/java.io.FileInputStream.<init>(Unknown Source)
			at java.base/java.io.FileInputStream.<init>(Unknown Source)
			at Test.main(Test.java:18)
		*/
		
		/*
		//ֻ�г�����ִ��finally֮ǰ�˳���JVM��finally����Ų���ִ��
		try{
			//�˳�JVM
			System.exit(0);			
		}finally{
			//����ִ��
			System.out.println("AAA");
		}
		*/
		
		try{
			FileInputStream fis = new FileInputStream("abc.java");
			//��ִ��
			System.out.println("TTT");
			
		}catch(FileNotFoundException e){
			//ִ��
			System.out.println("BBB");
		}finally{
			//ִ��
			System.out.println("AAA");
		}
		/*
		���Ϊ��
		BBB
		AAA
		*/
	}
}