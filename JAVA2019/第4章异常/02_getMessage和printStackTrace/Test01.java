import java.io.*;
public class Test01{
	public static void main(String[]	args){
		try{
			FileInputStream fis = new FileInputStream("ab.txt");
		}catch(FileNotFoundException e){
			//打印异常堆栈信息
			//一般情况下都会使用该方法去调试程序
			e.printStackTrace();
			/*
				java.io.FileNotFoundException: ab.txt (系统找不到指定的文件。)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
				at Test01.main(Test01.java:5)
			*/
			
			System.out.println(e.getMessage());	// ab.txt (系统找不到指定的文件。)
			System.out.println(e);	// java.io.FileNotFoundException: ab.txt (系统找不到指定的文件。)
		}
		System.out.println("ABC");
	}
	
}