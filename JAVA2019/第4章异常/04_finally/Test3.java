/*
	finally������һ����ִ�еģ�����ͨ���ڳ�����Ϊ�˱�֤ĳ��Դһ����
	�ͷţ�����һ����finally�������ͷ���Դ
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
				//Ϊ�˱�֤��Դһ�����ͷ�
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