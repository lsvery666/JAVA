/*
	java.io.DataOutputStream;�����ֽ������
	���Խ��ڴ��е�"int i=10;"д�뵽Ӳ���ļ���
	д��ȥ�Ĳ����ַ�����д��ȥ���Ƕ��������ݣ������͡�
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.txt"));

		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';

		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
	

		dos.flush();
		dos.close();
	
	}
	
}