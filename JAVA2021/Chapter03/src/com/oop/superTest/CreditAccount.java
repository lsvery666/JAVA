package com.oop.superTest;

public class CreditAccount extends Account{
    //独特属性信用度
    private double Credit;

    //Constructor
    public CreditAccount(){
        // super();
        System.out.println("CreditAccount的无参数构造方法执行");
    }
    /*
    错误：
    public CreditAccount(String name,double yue,double Credit){
        this.name = name;
        this.yue = yue;
        this.Credit = Credit;
    }
    name和yue是private类型，无法再别的类中调用。
    */
    public CreditAccount(String name,double yue,double Credit){
        // 体会下面两种方法区别
        // 1. 显式指定父类的构造方法
        super(name, yue);

        // 2. 手动调用父类的赋值方法
//        super.setName(name);
//        super.setYue(yue);

        this.Credit = Credit;
        System.out.println("CreditAccount的有参数构造方法执行");
    }

    public void setCredit(double Credit){
        this.Credit = Credit;
    }
    public double getCredit(){
        return Credit;
    }

}
