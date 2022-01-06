package com.oop.innerClass.localInnerClass;

/*
局部内部类，也叫方法内部类   声明在外部类的方法里
1. 方法内部类不允许使用访问权限修饰符（public、private、protected）均不允许。
2. 方法内部类可以声明在外部类的静态方法里，也可以声明在外部类的成员方法里。
3. 方法内部类对外部完全隐藏，除了创建这个类的方法可以访问它以外，其他地方均不能访问。
4. 方法内部类如果想要使用方法形参，该形参必须使用final声明（JDK8形参变为隐式final声明）
5. 方法内部类不能是static的，并且方法内部类中也不能声明static方法或变量。
6. 方法内部类中也会持有一个外部类的引用。
 */

public class Test01 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display(8);
    }
}

class Outer {
    private int num = 5;

    // 方法内部类不能是static的
//    public static void test2() {
//        static class Inner {
//        }
//    }


    public void display(int temp) {
        class Inner {
            // 方法内部类中也不能声明static方法或变量
            // public static int age = 10;

            public void func() {
                System.out.println(num);
                System.out.println(temp);
            }
        }
        new Inner().func();
    }

    public static void test1(int temp) {
        class Inner {
            public void func() {
                // 当方法内部类中声明在static方法中，则无法访问外部类的成员变量
//                System.out.println(num);
                System.out.println(temp);
            }
        }
        new Inner().func();
    }


}
