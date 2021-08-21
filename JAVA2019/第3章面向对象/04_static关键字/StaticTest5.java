/*
	关于代码的顺序
	静态语句块和静态变量都在类加载时按从上到下的顺序执行
*/
public class StaticTest5{
	/*
	//以下程序出错：
	static{
		System.out.println(i);
	}
	static int i = 100;
	*/
	static int i = 100;
	static{
		System.out.println(i);
	}
}
/*
	类{
	1.静态变量 "类名."
	2.静态方法 "类名."
	3.成员变量 "引用." 
	4.成员方法 "引用." 
	5.构造方法 
	6.静态语句块
	7.实例语句块
	}
*/