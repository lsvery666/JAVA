import java.io.*;
/*
	native int read(byte[] bytes);	// ���ط���
	��ȡ֮ǰ���ڴ���׼��һ��byte���飬ÿ�ζ�ȡ����ֽڴ洢��byte������
	һ�ζ�ȡ����ֽڣ����ǵ��ֽڶ�ȡ�ˡ�
	Ч�ʸ�
*/
public class Test03{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("temp01.txt");

		byte[] bytes = new byte[3];//ÿһ������ȡ�����ֽ�

		//int read(byte[] bytes);�÷������ص�int���͵�ֵ���������ζ�ȡ�˶��ٸ��ֽ�
		int i1 = fis.read(bytes);
		System.out.println(i1);//3
		//��byte����ת�����ַ���
		System.out.println(new String(bytes, 0, i1));//��a

		int i2 = fis.read(bytes);
		System.out.println(i2);//3
		System.out.println(new String(bytes, 0, i2));//bcd

		int i3 = fis.read(bytes);
		System.out.println(i3);//-1
		System.out.println(new String(bytes));//bcd
		// System.out.println(new String(bytes, 0, i3));//java.lang.StringIndexOutOfBoundsException
		
		int i4 = fis.read(bytes);
		System.out.println(i4);//-1

		fis.close();
	}
}
