/*
	�ļ�����
	ֻ�ܸ��ƴ��ı��ļ�
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("temp.txt");
		FileWriter fw = new FileWriter("copy.txt");
		
		char[] chars = new char[512];//1KB

		//һ�߶�һ��д
		while((int temp=fr.read(chars))!=-1){
			fw.write(chars, 0, temp);
		}
		
		fr.close();
		fw.flush();
		fw.close();
	}
}