import java.io.*;
import java.util.*;
import java.text.*;
/*
	File常用成员方法：
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
		//1.获取绝对路径
		File f1 = new File("Test02.java");
		System.out.println(f1.getAbsolutePath());	// D:\Lisen\JAVA\代码\第8章IO流\01_File\Test02.java

		//2.获取文件名
		System.out.println(f1.getName());	// Test02.java

		//获取父路径 相当于..
		System.out.println(f1.getParent());//null

		File f2 = new File("D:\\Lisen\\JAVA\\代码\\第8章IO流\\01_File\\Test02.java");
		System.out.println(f2.getParent());//D:\Lisen\JAVA\代码\第8章IO流\01_File

		//判断该File是目录还是文件
		System.out.println(f1.isDirectory());//false
		System.out.println(f2.isFile());//true

		//获取文件最后一次修改时间
		Date t = new Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));

		//获取文件的长度(字节数)
		System.out.println(f1.length());

		//列出当前路径下的所有路径，包括Directory和File
		File f3 = new File("D:\\Lisen\\JAVA\\代码");
		File[] files = f3.listFiles();
		for(File f:files){
			System.out.println(f.getAbsolutePath());
		}
	}
}