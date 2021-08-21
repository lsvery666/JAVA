/*
	DataInputStream
	要使用该流读取数据必须提前知道该文件中数据的存储格式，顺序
	读的顺序必须和写入的顺序相同
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(new FileInputStream("temp.txt"));
		/*
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		*/
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
	
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(c);

		dis.close();


	}
}