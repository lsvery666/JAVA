package com.oop.interfaceTest;

/*
1.接口之间可以多继承
2.类可以实现多个接口（多实现）
 */

interface P{
    void m1();
}

interface Q{
    void m2();
}

interface R extends P, Q{
    void m3();
}

interface Z{
    void m4();
}

public class InterfaceTest2 implements R, Z{
    public static void main(String[] args) {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}