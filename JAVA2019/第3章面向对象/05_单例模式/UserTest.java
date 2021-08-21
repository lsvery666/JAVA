/*
	单例模式是23种设计模式中最简单的一种设计模式
	为了解决什么问题？
	为了保证JAVA虚拟机中某一个类型的JAVA对象永远只有一个。
	为了节省内存的开销
*/
public class UserTest{
	public static void main(String[] args){
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		
		//==两边如果是基本数据类型，可以比较这两个基本类型是否相等
		//==两边如果是引用数据类型，则比较的是内存地址
		System.out.println(u1==u2);//False
		System.out.println(u2==u3);//Flase
		System.out.println(u3==u4);//Flase
	}
}