package com.oop.innerClass.fieldInnerClass;

/*
成员内部类，也叫普通内部类  类比成员方法
1. 成员内部类内部不允许创建任何static变量或方法。
2. 成员内部类是依附外部类的，只有创建了外部类才能创建内部类。
3. 在外部类内创建内部类：Inner i = new Inner()
4. 在外部类外创建内部类：Outer.Inner i = new Outer().new Inner()
 */

public class Test01 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.fun();

        Outer.Inner i = new Outer().new Inner();
        i.fun();
    }
}

class Outer{
    private String name = "Test";
    public static int age = 20;

    class Inner{
        // public static int num = 10;
        public void fun(){
            System.out.println(name);
            System.out.println(age);
            age = 30;
        }
    }

    public void fun(){
        Inner i = new Inner();
        i.fun();
    }

}


