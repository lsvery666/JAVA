//深入final
public class Test2{
	public static void main(String[] args){
		final Customer c = new Customer("Jack",15);
		/*
		c=new Customer("LUCKY",20);
		错误：c是final修饰的，无法重新创建对象，但可以改变对象的成员变量值
		*/
		c.name = "李四";
		c.age = 25;
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
 class Customer{
 	String name;
 	int age;
 	Customer(String name,int age){
 		this.name = name;
 		this.age = age;
 	}
 }