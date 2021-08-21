/*
	java.io.printStream 标准的输出流，默认打印到控制台，以字节方式
	java.io.printWriter 以字符方式
*/
import java.util.*;
import java.text.*;
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		System.out.println("HelloWorld");

		PrintStream ps = System.out;
		ps.println("JAVA....");

		//可以改变输出方向
		System.setOut(new PrintStream(new FileOutputStream("log")));//log日志文件
		
		//再次输出
		//System.out.println("HAHA");

		//通常使用上面的这种方式记录日志
		//需求：记录日志，m1方法开始执行的时间和结束的时间，记录到log文件中
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

		System.out.println("m1方法开始执行时间："+sdf.format(new Date()));
		m1();
		System.out.println("m1方法结束时间："+sdf.format(new Date()));
	}
	public static void m1(){}
}