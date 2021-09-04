package com.oop.extendsTest;
/*
	问题：super()和this()是否可以同时出现在构造函数中。
	两个语句只能有一个定义在第一行，所以只能出现其中一个。

	super()或者this():为什么一定要定义在第一行？
	因为super()或者this()都是调用构造函数，构造函数用于初始化，所以初始化的动作要先完成。
*/
public class Test01 {
    public static void main(String[] args){
        // 子类的所有构造函数中的第一行，其实都有一条隐身的语句super();
        // 所以子类在进行对象初始化时，先调用父类的构造函数（但不会创建父类的对象），这就是子类的实例化过程。
        CreditAccount a = new CreditAccount();
		/* 
			Account的无参构造方法执行
			CreditAccount的无参构造方法执行
		*/

        CreditAccount b = new CreditAccount(20, "Tom", 10.0);
        b.printInfo();
        b.printSuperInfo();

        b.setNum(1);
        //System.out.println(b.num);错误，子类无法直接访问父类中的私有变量
        //但可以间接访问
        System.out.println(b.getNum());

        b.m1();
        b.m2();
        Account.m2();
    }




}
