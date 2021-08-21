package com.oop.superTest;

public class Test01 {
    public static void main(String[] args){
        //创建CreditAccount类对象，尽管利用super()调用了Account类的构造方法，但不会创建Account类对象
        CreditAccount a = new CreditAccount();
        CreditAccount b = new CreditAccount("002",100.0,50);
        System.out.println(a.getName());
        System.out.println(a.getYue());
        System.out.println(a.getCredit());
        System.out.println(b.getName());
        System.out.println(b.getYue());
        System.out.println(b.getCredit());
    }
}
