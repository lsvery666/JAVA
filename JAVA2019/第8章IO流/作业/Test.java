/*
	��ҵ
*/
import java.io.*;
public class Test
{
	public static void main(String[] args) throws Exception{
		//E:\ѧϰ\Java\����
		File f=new File("E:\\ѧϰ\\JAVA\\����");
		method(f);
	}
	public static void method(File f) throws Exception{
		//���f���ļ�
		if(f.isFile()){
			//������
			FileInputStream fis=new FileInputStream(f.getAbsolutePath());
			FileOutputStream fos=new FileOutputStream("F:"+f.getAbsolutePath().substring(10));
			//һ�߶�һ��д
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
		//���f��Ŀ¼
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