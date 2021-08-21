package com.Collection.Generic;
/*
JDK5.0之后推出的新特性：泛型
泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。
使用了泛型好处是什么？
    第一：集合中存储的元素统一了
    第二：从集合中取出的元素类型是指定类型，不需要进行大量的“向下转型”
泛型的缺点是什么？
    导致集合中存储的元素缺乏多样性
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        // 自动类型推断 ArrayList<这里的类型会自动推断> 又称为钻石表达式 JDK8之后允许的
        List<Animal> l = new ArrayList<>();

        l.add(new Animal());
        l.add(new Bird());
        l.add(new Cat());

        Iterator<Animal> it = l.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            a.run();
        }
    }
}

class Animal{
    public void run()
    {
        System.out.println("Animal is moving");
    }
}

class Bird extends Animal{
    public void run(){
        System.out.println("Bird is flying");
    }
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
