/*
	实例语句块	可以用于实例的初始化，也称为构造代码块
	每次调用构造方法前会执行一次,注意调用构造方法时，会将类进行加载，但只加载一次，
	因此第一次调用构造方法会先执行静态语句块，再执行实例语句块，再执行构造方法，
	第二次调用时不再执行静态语句块，但是会执行实例语句块，再执行构造方法。
*/
public class StaticTest2{

	int age = 0;
	
	//无参数构造方法
	StaticTest2(){
		System.out.println("无参数构造方法执行！");
	}

	//实例语句块
	{
		age = 1;
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	{
		System.out.println("3");
	}

	//静态语句块
	static{
		// age = 1;	// 错误: 无法从静态上下文中引用非静态 变量 age
		System.out.println("A");
	}

	public static void main(String[] args){
		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();
		StaticTest2 s3 = new StaticTest2();
		System.out.println(s1.age);	// 1
		System.out.println(s2.age);	// 1
		System.out.println(s3.age); // 1
		/*
		A
		1
		2
		3
		无参数构造方法执行！
		1
		2
		3
		无参数构造方法执行！
		1
		2
		3
		无参数构造方法执行！
		*/
	}
}