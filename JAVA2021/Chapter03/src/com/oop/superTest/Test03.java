package com.oop.superTest;

class Super{
    void test(){
        System.out.println("Super test");
        test1();
    }

    void test1(){
        System.out.println("Super test1");
    }
}

class Sub extends Super{
    @Override
    void test() {
        super.test();
        System.out.println("Sub test");
    }

    @Override
    void test1() {
        super.test1();
        System.out.println("Sub test1");
    }
}

public class Test03 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.test();
    }
}
