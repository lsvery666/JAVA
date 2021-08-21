package com.oop.cloneTest;

/*
引用拷贝 引用1 = 引用2
两个引用指向同一个对象，改变其中一个，也会改变另一个
 */

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person("James");
        Person p2 = p1;
        p1.name = "Curry";
        System.out.println(p2.name);
    }
}

class Person{
    String name;
    Person(){}
    Person(String name){this.name = name;}
}