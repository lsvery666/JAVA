package bjpowernode;
import com.User;	// 当前路径下的com.User必须得是pulic的，才能在别的包里引用
// import com.Test;	// 错误: Test在com中不是公共的; 无法从外部程序包中对其进行访问
public class Test2{
	public static void main(String[]	args){
		// 在外包的非子类中不可以访问protected和缺省修饰的变量
		User u = new User();
		//System.out.println(u.name);	
		//System.out.prntln(u.age);
		
		// 在外包的子类中可以访问到protected修饰的变量，无法访问到缺省修饰的变量
		MyUser u2 = new MyUser();
		u2.m1();
	}
}

class MyUser extends User{
	public void m1(){
		System.out.println(this.name);	// null
		//System.out.println(this.age);
	}
}