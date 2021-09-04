package com.oop.extendsTest;

/*
子类覆盖父类时，必须要保证，子类方法的权限必须大于等于父类方法权限可以实现继承。否则，编译失败。
*/
public class CreditAccount extends Account{
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