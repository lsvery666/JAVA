/*
	程序在执行过程中，参数的传递问题：
	1.基本数据类型
	2.引用数据类型
*/
//引用数据类型
public class Canshuchuandi2{
	public static void m1(Animal a){
		a.age++;
		System.out.println("m1--->"+a.age);//11
	}
	public static void main(String[] args){
		Animal a = new Animal(10);
		m1(a);
		System.out.println("main--->"+a.age);//11 指针指向的对象的年龄值改变
	}
}
class Animal{
	int age;
	Animal(int _age){
		age=_age;
	}
}