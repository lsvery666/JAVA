/*
	使用递归找出某目录下的所有子目录以及子文件
*/
import java.io.*;
public class Test03
{
	public static void method(File f){
		if(f.exists()){
			//如果f是文件
			if(f.isFile()){
				return;
			}
			File[] fs = f.listFiles();//程序执行到此处，f一定是目录
			for(File subf:fs){//subf不一定是目录
				System.out.println(subf.getAbsolutePath());
				method(subf);
			}
		}
	}

	public static void main(String[] args) throws Exception{
		//E:\学习\Java\代码
		File f = new File("D:\\Lisen\\Java\\代码");
		method(f);
	}
	
}