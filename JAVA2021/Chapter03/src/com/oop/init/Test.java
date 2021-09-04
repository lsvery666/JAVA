package com.oop.init;

/*
<cinit>()中执行静态变量赋值语句和静态代码块，顺序就是代码中书写的顺序
1. 父类的<cinit>()
2. 子类的<cinit>()
3. 子类的<init>(){
       父类的<init>()
       显式初始化
       实例代码块
       构造方法
   }
 */
public class Test {
    static class ClassA{
        int b = v;
        int a1;
        int a2 = v++;
        static int a3 = v++;

        ClassA(){
            a1 = v++;
        }
    }

    static int v = 1;

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println("v = " + v);             // 4
        System.out.println("b = " + classA.b);      // 2
        System.out.println("a1 = " + classA.a1);    // 3
        System.out.println("a2 = " + classA.a2);    // 2
        System.out.println("a3 = " + classA.a3);    // 1
    }
}
