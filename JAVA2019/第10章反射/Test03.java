/*
	
*/
public class Test03
{
	public static void main(String[] args) throws Exception{
		//将A.class文件装在到JVM中的过程
		//Class.forName("A");//A....
		
		A a=new A();
		Class c=a.getClass();//A....

		//下面不会执行静态语句块
		//Class c=A.class;


	}
}
class A
{
	static{
		System.out.println("A....");
	}
}