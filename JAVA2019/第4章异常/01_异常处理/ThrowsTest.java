/*
	处理异常的方式一：throws 异常类名,异常类名,...
	使用throws处理异常不是真正处理异常而是推卸责任
	谁调用的就会抛给谁
*/
import java.io.*;
public class ThrowsTest{
	public static void main(String[] args) throws FileNotFoundException{//再往上抛就会把这个异常抛给JVM，在执行过程中报错
		m1();
		
		//执行过程中，如果上面的m1()方法如果出现了异常，下面语句不再执行。
		System.out.println("文件打开正常");
	} 
	public static void m1() throws FileNotFoundException{
		m2();
	}
	public static void m2() throws FileNotFoundException{
		m3();
	}
	public static void m3()  throws FileNotFoundException{
		new FileInputStream("ab.txt");	//FileInputStream构造方法声明位置上使用throws(向上抛)
	}
}
/*
	在程序运行过程中发生了FileNotFoundException类型的异常
	JVM为我们创建了一个FileNotFoundException类型的对象
	该对象携带以下信息。
	JVM负责将该对象的信息打印到控制台，并退出程序。
	Exception in thread "main" java.io.FileNotFoundException: ab.txt (系统找不到指定的文件。)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
        at ThrowsTest.m3(ThrowsTest.java:21)
        at ThrowsTest.m2(ThrowsTest.java:18)
        at ThrowsTest.m1(ThrowsTest.java:15)
        at ThrowsTest.main(ThrowsTest.java:9)
*/