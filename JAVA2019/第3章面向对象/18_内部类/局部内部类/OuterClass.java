/*
	局部内部类等同于局部变量
	重点：局部内部类在访问局部变量的时候，局部变量必须使用final修饰
*/
public class OuterClass{
	public void m1(){
		//局部变量
		final int i=10;
		
		//局部内部类
		//局部内部类不能用访问控制权限修饰符修饰
		class InnerClass{
			
			//局部内部类不能有静态声明
			//public static void m1(){}	
			
			public void m2(){
				System.out.println(i);
			}		
		}
		//以下这段语句不能放到main()中
		InnerClass inner= new InnerClass();
		inner.m2();
	}

	public static void main(String[] args){
		OuterClass oc = new OuterClass();
		oc.m1();
	}
}