package com.oop.init;

/*
<cinit>()中静态变量赋值语句和静态代码块按书写顺序执行
1. 父类的<cinit>()
2. 子类的<cinit>()
3. 子类的<init>(){
       父类的<init>()
       显式初始化和实例代码块按书写顺序执行
       构造方法
   }
 */
public class Test {
    static class ClassA{

        {
            a4 = v++;
            // System.out.println(a1);  // 此时还访问不到a1，但是可以赋值
            a1 = v++;
        }

        int b = v;
        int a1;
        int a2 = v++;
        static int a3 = v++;
        int a4;

        ClassA(){
            a1 = v++;
        }
    }

    static int v = 1;

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println("v = " + v);             // 6
        System.out.println("b = " + classA.b);      // 4
        System.out.println("a1 = " + classA.a1);    // 5
        System.out.println("a2 = " + classA.a2);    // 4
        System.out.println("a3 = " + classA.a3);    // 1
        System.out.println("a4 = " + classA.a4);    // 2
    }
}
