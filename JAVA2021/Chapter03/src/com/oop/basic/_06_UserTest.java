package com.oop.basic;

/*
Person p = new Person();
创建一个对象都在内存中做了什么事情？
1：先将硬盘上指定位置的Person.class文件加载进内存。
2：执行main方法时，在栈内存中开辟了main方法的空间(压栈-进栈)，然后在main方法的栈区分配了一个变量p。
3：在堆内存中开辟一个实体空间，分配了一个内存首地址值。new
4：在该实体空间中进行属性的空间分配，并进行了默认初始化。
5：对空间中的属性进行显式初始化。
6：进行实体的构造代码块初始化。
7：调用该实体对应的构造函数，进行构造函数初始化。
8：将首地址赋值给p ，p变量就引用了该实体。(指向了该对象)
 */

public class _06_UserTest{
    public static void main(String[] args){
        _05_User a = new _05_User();
        _05_User b = new _05_User(10);
        _05_User c = new _05_User("张三");
        _05_User d = new _05_User("张三",10);
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(d.name);
        System.out.println(d.age);
    }
}
