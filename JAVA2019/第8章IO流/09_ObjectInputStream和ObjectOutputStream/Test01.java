/*
	java.io.ObjectOutputStream;	序列化JAVA对象到硬盘(Serial)
	java.io.ObjectInputStream;	将硬盘中的数据“反序列化”到JVM内存(Deserial)

	compile		编译
	Decompile	反编译
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		User u1 = new User("刘德华");
		//创建输出流（序列化流）（JVM中的java对象状态保存到硬盘中）
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp"));
		oos.writeObject(u1);
		oos.flush();
		oos.close();
	}
}