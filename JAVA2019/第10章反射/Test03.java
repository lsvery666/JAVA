/*
	
*/
public class Test03
{
	public static void main(String[] args) throws Exception{
		//��A.class�ļ�װ�ڵ�JVM�еĹ���
		//Class.forName("A");//A....
		
		A a=new A();
		Class c=a.getClass();//A....

		//���治��ִ�о�̬����
		//Class c=A.class;


	}
}
class A
{
	static{
		System.out.println("A....");
	}
}