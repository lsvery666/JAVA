/*
	ʹ�õݹ��ҳ�ĳĿ¼�µ�������Ŀ¼�Լ����ļ�
*/
import java.io.*;
public class Test03
{
	public static void method(File f){
		if(f.exists()){
			//���f���ļ�
			if(f.isFile()){
				return;
			}
			File[] fs = f.listFiles();//����ִ�е��˴���fһ����Ŀ¼
			for(File subf:fs){//subf��һ����Ŀ¼
				System.out.println(subf.getAbsolutePath());
				method(subf);
			}
		}
	}

	public static void main(String[] args) throws Exception{
		//E:\ѧϰ\Java\����
		File f = new File("D:\\Lisen\\Java\\����");
		method(f);
	}
	
}