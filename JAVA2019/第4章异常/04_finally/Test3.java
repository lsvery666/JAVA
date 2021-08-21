/*
	finally语句块是一定会执行的，所以通常在程序中为了保证某资源一定会
	释放，所以一般在finally语句块中释放资源
*/
import java.io.*;
public class Test3{
		public static void main(String[]	args){
			FileInputStream fis=null;
			try{
				fis=new FileInputStream("abc.java");
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}finally{
				//为了保证资源一定会释放
				if(fis!=null){
					try{
						fis.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
}