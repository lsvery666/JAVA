 //一个类可以实现多个接口,如果是非抽象类，需要将抽象方法重写
 //implements是实现的意思，是一个关键字，和extends意义相同
 public class Myclass implements A{
 	public void m1(){
		System.out.println("m1 excute!");
	}
 	public void m2(){
		System.out.println("m2 excute!");
	}
	public static void main(String[] args){
		
		A a = new Myclass();

		System.out.println(a.a);

		// a.a = 100;//无法为最终变量a分配值
		
		a.m1();

		a.m2();

	}
 }
 
 class F implements B, C{
 	public void m1(){}
 	public void m2(){}
 }
 