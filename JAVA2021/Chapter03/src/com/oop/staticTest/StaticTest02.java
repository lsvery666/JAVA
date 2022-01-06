package com.oop.staticTest;

/*
	实例语句块	可以用于实例的初始化，也称为构造代码块
	每次调用构造方法前会执行一次,注意调用构造方法时，会将类进行加载，但只加载一次，
	因此第一次调用构造方法会先执行静态语句块，再执行实例语句块，再执行构造方法，
	第二次调用时不再执行静态语句块，但是会执行实例语句块，再执行构造方法。
*/
public class StaticTest02{

    int age = 10;

    //无参数构造方法
    StaticTest02(){
        System.out.println("无参数构造方法执行！");
    }

    //实例语句块
    {
        age = 100;
        num = 200;
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }

    int num = 20;

    //静态语句块
    static{
        // age = 1;	// 错误: 无法从静态上下文中引用非静态 变量 age
        System.out.println("A");
    }

    public static void main(String[] args){
        StaticTest02 s1 = new StaticTest02();
        StaticTest02 s2 = new StaticTest02();
        StaticTest02 s3 = new StaticTest02();
        System.out.println(s1.age);	// 100
        System.out.println(s1.num); // 20
        System.out.println(s2.age);	// 100
        System.out.println(s3.age); // 100
		/*
		A
		1
		2
		3
		无参数构造方法执行！
		1
		2
		3
		无参数构造方法执行！
		1
		2
		3
		无参数构造方法执行！
		*/
    }
}
