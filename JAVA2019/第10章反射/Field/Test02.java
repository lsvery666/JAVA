/*
	java.lang.reflect.Field;  获取某个指定的属性
		public void set(Object obj,Object value){}    //给指定对象的该属性赋值
		public Object get(Object obj){}               //获得指定对象的该属性的值
*/
import java.lang.reflect.Field;
public class Test02
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("User");

		//获取某个特定的属性
		Field f=c.getDeclaredField("id");

		Object o=c.newInstance();
		
		//id由private修饰，需要打破封装性
		f.setAccessible(true);//使用反射机制可以打破封装性，导致了java对象的属性不安全
		
		f.set(o,"2150100069");

		System.out.println(f.get(o));


	}
}