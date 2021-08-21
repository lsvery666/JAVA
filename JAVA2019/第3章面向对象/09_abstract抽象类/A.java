/*
    1.class 关键字前加 abstract
	2.抽象类无法被实例化
	3.虽然抽象类没有办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的。
	4.抽象类中可以定义抽象方法
	抽象方法的语法：在方法的修饰符列表中添加abstract关键字，并且抽象方法应该以“；”，不能带有“{}”
	5.抽象类中不一定有抽象方法，但抽象方法只能定义在抽象类中。
	6.一个非抽象的类要继承抽象类，必须将抽象类中的抽象方法覆盖
	7.抽象关键字abstract和哪些不可以共存？final, private, static 
*/
public abstract class A{
	//成员变量
	public int a = 10;
	//Constructor
	A(){
		System.out.println("A....");
	}
	
	//抽象方法
	public abstract void m1();
	
	//非抽象方法
	public void m2(){
		
		System.out.println("m2 excutes!");

	}

	public static void main(String[] args){
		//抽象类无法创建对象
		//A a = new A();
		
		//多态
		A a = new B();
	}
}