/*
	反序列化
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp"));
		//反序列化
		Object o = ois.readObject();
		System.out.println(o);
		ois.close();
	}
}