/*
	作业
*/
import java.io.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//E:\学习\Java\代码
		File f=new File("E:\\学习\\JAVA\\代码");
		method(f);
	}
	public static void method(File f) throws Exception{
		//如果f是文件
		if(f.isFile()){
			//创建流
			FileInputStream fis=new FileInputStream(f.getAbsolutePath());
			FileOutputStream fos=new FileOutputStream("F:"+f.getAbsolutePath().substring(10));
			//一边读一边写
			byte[] bytes=new byte[1024];
			int temp=0;
			while((temp=fis.read(bytes))!=-1){
				fos.write(bytes);
			}
			fos.flush();
			fis.close();
			fos.close();
			return;
		}
		//如果f是目录
		File[] fs=f.listFiles();
		for(File subf:fs){
			if(subf.isDirectory()){
				File tempf=new File("F:"+subf.getAbsolutePath().substring(10));
				tempf.mkdirs();
			}
			method(subf);
		}
	}
}