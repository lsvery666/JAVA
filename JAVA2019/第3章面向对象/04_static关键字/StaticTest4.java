/*
	静态变量被存储在方法区，所有的JAVA对象共享这一份，所以静态变量是类级别的，采用“类名.”的方式访问。
	如果这个属性所有的对象都有，并且这个属性的值是相同的，则该属性声明称静态变量。
	成员变量：在创建对象时候初始化
	静态变量：在类加载阶段赋值，并只赋值一次
*/
public class StaticTest4{
	public static void main(String[] args){
		Animal a1 = new Animal("AAA",10);
		Animal a2 = new Animal("BBB",11);
		//采用“类名.”的方式访问
		System.out.println(Animal.type);
		//也可以使用“引用.”
		System.out.println(a1.type);
		
		Animal a3 = null;
		System.out.println(a3.type);//不会出现空指针异常
	}
}

//抽象现实世界中的“陆生”动物
class Animal{
	//Field
	//成员变量（一个对象一份）
	//成员变量在创建对象时初始化，并且存储在堆中的每一个对象中
	String name;
	int age;
	static String type = "陆生";//存储在方法区
	//静态变量被存储在方法区，所有的JAVA对象共享这一份
	//所以静态变量是类级别的，采用“类名.”的方式访问
	//Constructor
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
}