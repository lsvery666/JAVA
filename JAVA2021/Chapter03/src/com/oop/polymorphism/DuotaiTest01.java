package com.oop.polymorphism;

/*
1. 多态的好处：提高了程序的扩展性
2. 多态的弊端：当父类引用指向子类对象时，虽然提高了扩展性，但是只能访问父类中具备的方法，不可以访问子类中特有的方法。(前期不能使用后期产生的功能，即访问的局限性)
 */

public class DuotaiTest01 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Animal b = new Cat();
        b.eat();
        // b.run();    // 找不到符号：方法 run()
        ((Cat)b).run();
    }
}

interface Animal{
    String name = "Animal";
    void eat();
}

class Dog implements Animal{
    String name = "Dog";

    public void eat(){
        System.out.println("Dog is eating");
    }

}

class Cat implements Animal{
    String name = "Cat";

    public void eat(){
        System.out.println("Cat is eating");
    }

    void run(){
        System.out.println("Cat is running");
    }
}
