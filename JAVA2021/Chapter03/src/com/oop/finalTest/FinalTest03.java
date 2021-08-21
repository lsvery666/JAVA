package com.oop.finalTest;

/*
父类中final修饰的静态变量或非静态变量，子类中也不能修改
 */

public class FinalTest03 {
}

class A{
    public static final String name = "A";
    public final int age = 10;
}

class B extends A{
    B(){
        // name = "B";
        // age = 6;
    }
}