/*
	获取某个特定的构造方法，然后创建对象
*/
import java.lang.reflect.*;
public class Test02
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("Customer");
		Constructor con=c.getDeclaredConstructor(String.class,int.class);
		Object o=con.newInstance("张三",25);
		System.out.println(o);
	}
}
class Customer
{
	String name;
	int age;
	Customer(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "Customer["+name+","+age+"]";
	}
}