/*
	关于类获取父类和父接口
*/
public class Test01
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java.util.Date");
		
		//获取父类
		Class superClass=c.getSuperclass();

		System.out.println(superClass.getName());
		
		//获取父接口
		Class[] ins=c.getInterfaces();

		for(Class in:ins){
			System.out.println(in.getName());
		}
	}
}