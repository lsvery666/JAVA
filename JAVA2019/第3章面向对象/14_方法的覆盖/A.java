/*
	私有的方法无法被覆盖
*/

public class A{
	//私有方法
	private void m1(){
		System.out.println("A'm1 method invoke!");
	}
	//公开的方法
	public void m2(){
		System.out.println("A'm2 method invoke!");
	}
	public static void main(String[] args){
		//多态
		A a = new B();
		a.m1();
		a.m2();
	}
}

class B extends A{
	//尝试重写父类型私有的方法
	public void m1(){
		System.out.println("B'm1 method invoke!");
	}
	//重写父类型公开的方法
	public void m2(){
		System.out.println("B'm2 method invoke!");
	}
}