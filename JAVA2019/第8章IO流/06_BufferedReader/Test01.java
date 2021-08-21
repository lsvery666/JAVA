/*
	BufferedReader;带有缓冲区的字符输入流
	BufferedReader(FileReader fr)
	String readLine()
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//创建一个带有缓冲区的字符输入流
		FileReader fr = new FileReader("Test01.java");//创建一个文件字符输入流
		BufferedReader br = new BufferedReader(fr);//将文件字符输入流包装成带有缓冲区的字符输入流
		//根据流出现的位置，流又可以分为：包装流(也叫处理流)和节点流
		//FileReader fr是一个节点流
		//BufferedReader br是一个包装流或者处理流

		//开始读
		//br.readLine()方法读取一行，但是行尾不带换行符
		//这就是为什么通常要在代码文件的最后一行空一行
		String temp = null;
		while((temp=br.readLine())!=null){
			System.out.println(temp);
		}

		//关闭
		//注意：关闭的时候只需要关闭最外层的包装流。（一种设计模式，叫做装饰者模式）
		br.close();
		
	}
}