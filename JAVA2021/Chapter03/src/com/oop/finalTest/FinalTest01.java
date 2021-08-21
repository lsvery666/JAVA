package com.oop.finalTest;

/*
1：final可以修饰类，方法，变量。
2：被final修饰的类是一个最终类，不可以被继承。
3：被final修饰的方法是一个最终方法，不可以被覆盖。
4：被final修饰的变量是一个常量，必须手动初始化，只能赋值一次，常与static连用。
 */

final class FinalClass{}
// class Test extends FinalClass{}

class Circle
{
    static final float PI = 3.1415926f;

    public static void main(String[] args) {
        // PI = 3.5f; // 无法为最终变量PI分配值
    }

    public final void m1(){
        System.out.println("final m1()执行");
    }
}

class SubClass extends Circle{
    // public void m1(){}  // 被覆盖的方法为final
}