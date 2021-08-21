package com.oop.finalTest;

// 深入final
// final修饰的引用不能修改指向，但是可以修改引用指向对象的值，相当于一个常量指针。
public class FinalTest02 {
    public static void main(String[] args) {
        final Customer c = new Customer("MJ", 18);
        // c = new Customer("LS", 20);  // 无法为最终变量c分配值
        c.name = "LS";
        c.age = 20;
    }
}

class Customer{
    String name;
    int age;
    Customer(String name, int age){
        this.name = name;
        this.age = age;
    }
}
