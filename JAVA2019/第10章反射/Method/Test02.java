/*
	��ȡĳ���ض��ķ���
	ͨ��������Ƶ���
*/
import java.lang.reflect.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("CustomerService");

		//��ȡĳ���ض��ķ���
		//ͨ����������+�β��б�
		Method m=c.getDeclaredMethod("login",String.class,String.class);

		Object o=c.newInstance();
		//����o�����m����������"admin","123"������������ִ�н��ʱretValue
		Object retValue=m.invoke(o,"admin","123");

		System.out.println(retValue);//true

	}
}