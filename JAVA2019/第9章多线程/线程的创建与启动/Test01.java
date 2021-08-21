/*
	分析一下程序有几个线程？

	只有一个线程，就是主线程
	main, m1, m2, m3这四个方法在同一个栈空间中
*/
public class Test01
{
	public static void main(String[] args){
		m1();
	}
	public static void m1(){
		m2();
	}
	public static void m2(){
		m3();
	}
	public static void m3(){
		System.out.println("HelloWorld");
	}
}