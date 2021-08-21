package com.oop.extendsTest;
/*
	问题：super()和this()是否可以同时出现在构造函数中。
	两个语句只能有一个定义在第一行，所以只能出现其中一个。

	super()或者this():为什么一定要定义在第一行？
	因为super()或者this()都是调用构造函数，构造函数用于初始化，所以初始化的动作要先完成。
*/
public class Test01 {
    public static void main(String[] args){

        CreditAccount a = new CreditAccount();
		/* 
			Account的无参构造方法执行
			CreditAccount的无参构造方法执行
		*/
        // 子类的所有构造函数中的第一行，其实都有一条隐身的语句super();
        // 所以子类在进行对象初始化时，先调用父类的构造函数（但不会创建父类的对象），这就是子类的实例化过程。

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

    /*
        子类覆盖父类时，必须要保证，子类方法的权限必须大于等于父类方法权限可以实现继承。否则，编译失败。
         */
    public static class CreditAccount extends Account{
        // 信誉度
        double credit;

        // 静态变量
        static String className = "CreditAccount";

        CreditAccount(){
            System.out.println("CreditAccount的无参构造方法执行");
        }

        CreditAccount(int num, String name, double credit)
        {
            super(num, name);
            this.credit = credit;
        }

        // 非静态方法
        public void printInfo()
        {
            System.out.print(className);
            System.out.println(" {num: " + getNum() + ", name: " + getName() + ", Credit: " + credit + "}");
        }

        public void printSuperInfo()
        {
            System.out.print(super.className);
            super.printInfo();
        }

        // 非静态方法
        public void m1()
        {
            System.out.println("CreditAccount的非静态m1()方法执行");
        }

        // 静态只能覆盖静态，或者被静态覆盖
        // 错误: CreditAccount中的m2()无法覆盖Account中的m2()
        // public void m2()
        // {
        //     System.out.println("CreditAccount的非静态m2()方法执行");
        // }

         public static void m2()
         {
             System.out.println("CreditAccount的静态m2()方法执行");
         }
    }

    // 类的继承
    public static class Account {
        private int num;
        private String name;
        static String className = "Account";

        Account(){
            System.out.println("Account的无参构造方法执行");
        }

        Account(int num, String name){
            System.out.println("Account的有参构造方法执行");
            this.num = num;
            this.name = name;
        }


        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printInfo(){
            System.out.println("Account {num:"+num+", name:"+name+"}");
        }

        public void m1(){
            System.out.println("Account的非静态m1()方法执行");
        }

        public static void m2(){
            System.out.println("Account的静态m2()方法执行");
        }
    }
}
