/*
	java.io.InputStream;
		java.io.FileInputStream; 文件字节输入流

		按照字节方式读取文件
	
	成员方法：
		int read() 返回值-1 ~ 255, -1代表已经读到了文件末尾, 0 ~ 255是一个字节对应的十进制无符号数范围

	键盘输入采用UGB编码，一个字母'a'并不是一个占用两个字节的字符，而是97，即01100001，占一个字节
	但一个汉字'中'在编码时占用了两个字节即11010110 11010000	( 214 208 )
*/
import java.io.*;
public class Test01{
	public static void main(String[] args){
		FileInputStream fis=null;
		try{
			//1.要读取某文件，先与这个文件创建一个"输入流"。
			//文件路径
			//String filePath="temp01.txt";//相对路径，相对当前而言，在当前路径下找
			//String filePath="D:\\Lisen\\JAVA\\代码\\第8章IO流\\02_FileInputStream\\temp01.txt";
			String filePath = "D:/Lisen/JAVA/代码/第8章IO流/02_FileInputStream/temp01.txt";
			fis = new FileInputStream(filePath);	// FileNotFoundException if !filePath.exists()
			
			//2.开始读
			int i1 = fis.read();//以字节的方式读取
			int i2 = fis.read();
			int i3 = fis.read();
			int i4 = fis.read();
			int i5 = fis.read();
			int i6 = fis.read();
			int i7 = fis.read();
			
			System.out.println(i1);//214
			System.out.println(i2);//208
			System.out.println(i3);//97
			System.out.println(i4);//98
			System.out.println(i5);//99
			System.out.println(i6);//100
			System.out.println(i7);//-1 如果已经读到了文件尾，返回-1
			
		}catch(FileNotFoundException e){

			e.printStackTrace();
		
		}catch(IOException e){
			
			e.printStackTrace();

		}finally{
		
			//为了保证流一定会释放，所以在finally语句块声明
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		
		}
	}
}

