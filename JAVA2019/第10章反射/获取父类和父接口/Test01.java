/*
	�������ȡ����͸��ӿ�
*/
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java.util.Date");
		
		//��ȡ����
		Class superClass=c.getSuperclass();

		System.out.println(superClass.getName());
		
		//��ȡ���ӿ�
		Class[] ins=c.getInterfaces();

		for(Class in:ins){
			System.out.println(in.getName());
		}
	}
}