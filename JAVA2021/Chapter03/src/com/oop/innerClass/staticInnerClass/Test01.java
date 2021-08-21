package com.oop.innerClass.staticInnerClass;

/*
静态内部类和非静态内部类之间存在一个最大的区别，非静态内部类在编译完成之后会隐含的保存着一个引用.
该引用是指向创建它的外围类，但是静态类没有。没有这个引用就意味着：
1.静态内部类的创建不需要依赖外部类可以直接创建。
2.静态内部类不可以使用任何外部类的非static类（包括属性和方法），但可以存在自己的成员变量。
3.外部创建方法：Outer.Inner i = new Outer.Inner()
 */

public class Test01 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.func();

        Outer.Inner i = new Outer.Inner();
        i.func();
    }
}

class Outer{
    public static String name = "Outer";
    private int age = 20;
    static class Inner{
        private String name = "Inner";
        public void func(){
            System.out.println(name);
            // System.out.println(age);
        }
    }

    public void func(){
        Inner i = new Inner();
        i.func();
    }

}
