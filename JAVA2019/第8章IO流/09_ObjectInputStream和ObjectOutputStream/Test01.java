/*
	java.io.ObjectOutputStream;	���л�JAVA����Ӳ��(Serial)
	java.io.ObjectInputStream;	��Ӳ���е����ݡ������л�����JVM�ڴ�(Deserial)

	compile		����
	Decompile	������
*/
import java.io.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		User u1 = new User("���»�");
		//��������������л�������JVM�е�java����״̬���浽Ӳ���У�
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp"));
		oos.writeObject(u1);
		oos.flush();
		oos.close();
	}
}