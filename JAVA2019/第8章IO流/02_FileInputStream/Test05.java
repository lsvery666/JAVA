import java.io.*;
public class Test05
{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("temp01.txt");
		System.out.println(fis.available());	// 6
		System.out.println(fis.read());	// 214	
		//int available();��������ʣ��Ĺ����ֽ���
		System.out.println(fis.available());	// 5

		//���������ֽ�
		fis.skip(2);
		System.out.println(fis.read());	// 98
		fis.close();
	}
}