/*
	程序在执行过程中，参数的传递问题：
	1.基本数据类型
	2.引用数据类型
*/
//基本数据类型
public class Canshuchuandi{
	public static void m1(int i){
		i++;
		System.out.println("m1--->"+i);//11
	}
	public static void main(String[] args){
		int i=10;
		m1(i);
		System.out.println("main--->"+i);//10 两个i所在内存不同
	}
}