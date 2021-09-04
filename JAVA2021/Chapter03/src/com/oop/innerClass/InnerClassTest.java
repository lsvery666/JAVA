package com.oop.innerClass;

/*
内部类的优点:
    1. 内部类与外部类可以方便的访问彼此的私有域（包括私有方法、私有属性）。
    2. 内部类是另外一种封装，对外部的其他类隐藏。
    3. 内部类可以实现java的单继承局限。
 */

class A {
    private String name = "A类的私有域";
    public String getName() {
        return name;
    }
}

class B {
    private int age = 20;
    public int getAge() {
        return age;
    }
}

class Outter {
    private class InnerClassA extends A {
    }
    private class InnerClassB extends B {
    }
    public String getName() {
        // 访问内部类的私有方法
        return new InnerClassA().getName();
    }
    public int getAge() {
        return new InnerClassB().getAge();
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        Outter outter = new Outter();
        System.out.println(outter.getName());
        System.out.println(outter.getAge());
    }
}

