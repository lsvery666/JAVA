package com.oop.staticTest;

/*
static修饰的变量称为静态变量
1.静态变量所属于类。所以也称为类变量。
2.静态变量存在于方法区中。
3.静态变量在类加载阶段赋值，并只赋值一次。随着类的消失而消失。
4.静态变量可以被对象调用，也可以被类名调用。
 */
public class StaticTest04 {
    public static void main(String[] args) {
        Animal a1 = new Animal("AAA", 10);
        Animal a2 = new Animal("BBB", 11);
        //采用“类名.”的方式访问
        System.out.println(Animal.type);
        //也可以使用“引用.”
        System.out.println(a1.type);

        Animal a3 = null;
        System.out.println(a3.type);//不会出现空指针异常
    }
}

//抽象现实世界中的“陆生”动物
class Animal {
    //Field
    //成员变量（一个对象一份）
    //成员变量在创建对象时初始化，并且存储在堆中的每一个对象中
    String name;
    int age;

    //静态变量被存储在方法区，所有的JAVA对象共享这一份
    //所以静态变量是类级别的，采用“类名.”的方式访问
    static String type = "陆生"; //存储在方法区，不一定要显式初始化


    //Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
