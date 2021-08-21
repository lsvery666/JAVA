/*
	匿名内部类
	想要定义匿名内部类：需要前提，内部类必须继承一个类或者实现接口。
	优点：少定义一个类
	缺点：无法实现代码复用
*/
public class OuterClass{
	//静态方法
	public static void test(CustomerService cs){
		cs.logout();
	}
	public static void main(String[]	args){
		//调用test方法
		test(new CustomerServiceImpl());

		//使用匿名内部类的方式执行test方法
		//整个这个"new CustomerService(){}"就是个匿名内部类
		test(new CustomerService(){
			public void logout(){
				System.out.println("系统已经安全退出!");
			}
		});
	}
}

//接口
interface CustomerService{
	void logout();
}

//编写一个类实现上接口
class CustomerServiceImpl implements CustomerService{
	public void logout(){
		System.out.println("系统已经安全退出!");
	}
}
