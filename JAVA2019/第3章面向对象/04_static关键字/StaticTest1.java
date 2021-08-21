/*
	static 定义的静态语句块在类加载阶段执行，并且是自上而下的顺序执行的。
	可以完成类的初始化。静态代码块随着类的加载而执行，而且只执行一次（new 多个对象就只执行一次）。
	如果和主函数在同一类中，优先于主函数执行。
*/
public class StaticTest1{
	
	public static void main(String[] args){
		System.out.println("main excute!");
	}

	//静态语句块
	static{
		System.out.println("1");
	}
	static{
		System.out.println("2");
	}
	static{
		System.out.println("3");
	}
	static{
		System.out.println("4");
	}

	/* 
		java StaticTest1
		1
		2
		3
		4
		main excute!
	*/
}

class StaticTest1_
{
	public static void main(String[] args){
		StaticTest1 s1 = new StaticTest1();
		StaticTest1 s2 = new StaticTest1();
		/* 
			java StaticTest1_
			1
			2
			3
			4
		*/
	}
}