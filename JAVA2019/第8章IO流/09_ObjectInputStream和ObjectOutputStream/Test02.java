/*
	�����л�
*/
import java.io.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp"));
		//�����л�
		Object o = ois.readObject();
		System.out.println(o);
		ois.close();
	}
}