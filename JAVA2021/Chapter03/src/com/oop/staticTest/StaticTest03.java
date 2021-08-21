package com.oop.staticTest;

/*
static修饰的方法称为静态方法
1.静态方法只能访问静态成员，不可以访问非静态成员。
2.静态方法中不能使用this，super关键字。
3.静态方法和静态变量可以通过类名.和对象.的方式进行调用。
*/

public class StaticTest03{

    public void m1(){
        System.out.println("m1()");
    }


    public static void m2(){

        System.out.println("static m2()");
    }

    public static void main(String[] args){
        StaticTest03 st = new StaticTest03();
        st.m1();

        m2();
        StaticTest03.m2();

        StaticTest03 s = null;
        s.m2(); // 不会报错
    }
}
