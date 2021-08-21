package com.oop.interfaceTest;

/*
1. 接口中的成员都有固定的修饰符，变量都是public static final型的，成员方法（非静态方法）都是public abstract型的；
2. 接口的子类必须实现了接口中所有的抽象方法后，该子类才可以实例化。否则，该子类还是一个抽象类；
3. 继承用extends，实现用implements；
4. 接口和类不一样的地方，就是，接口可以被多实现；
5. 接口可以多继承接口；
6. 接口中可以有静态方法，且静态方法必须有方法体；
7. 接口中的非静态方法都是抽象方法，因此不能有方法体。
8. 接口中没有构造方法，因为接口是用来implements的，不存在继承关系。
 */

public interface InterfaceTest {
    String NAME = "Li Sen";
    int AGE = 18;
    void m1();
    void m2();

    static void m3() {
        System.out.println("m3()方法执行");
    }

    // void m4(){ }
}

class Test implements InterfaceTest{

    public static void main(String[] args) {
        // NAME = "H";
        // AGE = 20;
        Test t = new Test();
        t.m1();
        t.m2();
        InterfaceTest.m3();
    }

    @Override
    public void m1() {
        System.out.println("m1()方法执行");
    }

    @Override
    public void m2() {
        System.out.println("m2()方法执行");
    }
}
