public class _07_method{
	public static void main(String[] args){
		A.m1();
		_07_function01.m2();
		m2();
	}
	public static void m2(){
		System.out.println("m2执行成功！");
	}
}
class A{
	public static void m1(){
		System.out.println("m1执行成功！");
	}
}