/*
	java.lang.reflect.Field;  ��ȡĳ��ָ��������
		public void set(Object obj,Object value){}    //��ָ������ĸ����Ը�ֵ
		public Object get(Object obj){}               //���ָ������ĸ����Ե�ֵ
*/
import java.lang.reflect.Field;
public class Test02
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("User");

		//��ȡĳ���ض�������
		Field f=c.getDeclaredField("id");

		Object o=c.newInstance();
		
		//id��private���Σ���Ҫ���Ʒ�װ��
		f.setAccessible(true);//ʹ�÷�����ƿ��Դ��Ʒ�װ�ԣ�������java��������Բ���ȫ
		
		f.set(o,"2150100069");

		System.out.println(f.get(o));


	}
}