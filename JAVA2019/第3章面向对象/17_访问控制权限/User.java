package com;
/*
	访问控制权限修饰符：public，protected，缺省，private
	
	1.修饰类的只有public和缺省，缺省修饰的类不能通过import导入

	2.四种修饰符都可以修饰方法和变量
	private：只能在本类中访问
	缺省：本类可以，同一个包下利用，不同包下不行，子类在包外不可以，在包内可以
	protected：本类，同一个包下,不同包下不行，子类中可以
	public：可以在任意位置访问

*/
public class User{
	//protected修饰
	protected String name;

	//缺省(default)修饰
	int age;	
}

class Test{
	public static void main(String[] args){
		User u=new User();
		System.out.println(u.name);		// null
		System.out.println(u.age);		// 0
	}
}