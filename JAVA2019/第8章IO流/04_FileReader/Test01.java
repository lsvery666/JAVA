/*
	java.io.*;
		java.io.InputStreamReader;转换流（字节输入流转换为字符输入流）
			java.io.FileReader;文件字符输入流
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args){
		FileReader fr=null;
		try
		{
			//创建文件字符输入流
			fr = new FileReader("测试.txt");
			//开始读
			char[] chars = new char[512];//1KB
			int temp = 0;
			while((temp=fr.read(chars))!=-1){
				System.out.println("length:"+temp+", "+new String(chars,0,temp));
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try
				{
					fr.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}