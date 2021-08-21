//经理
public class Manager extends Employee{
	String name = "李四";
	//成员方法
	public void work(){
		System.out.println("经理在工作");
	}
	public void m1(){
		//work();
		super.work();
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	/*
	错误：
	public static void m2(){
		System.out.println(super.name);
	}
	super和this一样不能用在静态方法中。
	*/
}