/*
	final修饰的类无法被继承
*/
final class A{}
class B extends A{}

//final修饰的方法无法被覆盖
class A{
	public final void m1(){}
}
class B extends A{
	public void m1(){}
}

//final修饰的变量是一个常量
class A{
	public void m1(){
		final int i;
		i = 100;
		
		// i=200; //错误
	}
}

//final修饰的成员变量必须手动初始化，不会赋默认值
class A{
	// 初始化方法一：直接显式初始化
	final int i = 100;
	
	
	// 初始化方法二：通过赋值语句初始化
	final int k;
	A(){
		k = 200;
	}
}

//final修饰的成员变量一般和static连用
class MyMath{
	//常量：Java规范中要求所有的常量“大写”
	public static final double PI = 3.14;
	
}


