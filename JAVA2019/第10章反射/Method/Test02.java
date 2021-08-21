/*
	获取某个特定的方法
	通过反射机制调用
*/
import java.lang.reflect.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("CustomerService");

		//获取某个特定的方法
		//通过：方法名+形参列表
		Method m=c.getDeclaredMethod("login",String.class,String.class);

		Object o=c.newInstance();
		//调用o对象的m方法，传递"admin","123"参数，方法的执行结果时retValue
		Object retValue=m.invoke(o,"admin","123");

		System.out.println(retValue);//true

	}
}