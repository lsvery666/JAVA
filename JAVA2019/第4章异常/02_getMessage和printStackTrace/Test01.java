import java.io.*;
public class Test01{
	public static void main(String[]	args){
		try{
			FileInputStream fis = new FileInputStream("ab.txt");
		}catch(FileNotFoundException e){
			//��ӡ�쳣��ջ��Ϣ
			//һ������¶���ʹ�ø÷���ȥ���Գ���
			e.printStackTrace();
			/*
				java.io.FileNotFoundException: ab.txt (ϵͳ�Ҳ���ָ�����ļ���)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
				at Test01.main(Test01.java:5)
			*/
			
			System.out.println(e.getMessage());	// ab.txt (ϵͳ�Ҳ���ָ�����ļ���)
			System.out.println(e);	// java.io.FileNotFoundException: ab.txt (ϵͳ�Ҳ���ָ�����ļ���)
		}
		System.out.println("ABC");
	}
	
}