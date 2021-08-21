package com.oop.abstractTest;

/*
    abstract可以修饰类和方法

    1.class 关键字前加 abstract
	2.抽象类无法被实例化
	3.虽然抽象类没有办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的。
	4.抽象类中可以定义非抽象方法
	5.抽象类中不一定有抽象方法，但抽象方法只能定义在抽象类中。
	抽象方法的语法：在方法的修饰符列表中添加abstract关键字，并且抽象方法应该以“；”结束，不能带有“{}”
	6.一个非抽象的类要继承抽象类，必须将抽象类中的抽象方法覆盖
	7.抽象关键字abstract和哪些不可以共存？final, private, static
*/

public abstract class AbstractClass {
    public int a = 10;

    AbstractClass() {
        System.out.println("AbstractClass无参构造方法执行");
    }

    // 抽象方法
    public abstract void m1();

    // 非抽象方法
    public void m2() {
        System.out.println("m2()方法执行");
    }

    public static void main(String[] args) {
        // AbstractClass a = new AbstractClass();   // 抽象类无法创建对象
        AbstractClass a = new TestClass();
        a.m1();
        a.m2();
    }

}

class TestClass extends AbstractClass {

    TestClass() {
        System.out.println("TestClass无参构造方法执行");
    }

    // 一个非抽象的类要继承抽象类，必须将抽象类中的抽象方法覆盖
    public void m1() {
        System.out.println("m1()方法执行");
    }
}
