package com.Thread.synchronize;

/*
	当同步函数被static修饰时，这时的同步用的是哪个锁呢？
	静态函数在加载时所属于类，这时有可能还没有该类产生的对象，但是该类的字节码文件加载进内存就已经被封装成了对象，这个对象就是该类的字节码文件对象。
	所以静态加载时，只有一个对象存在，那么静态同步函数就使用的这个对象。
	这个对象就是 类名.class
*/
public class SynchronizeTest04 {
    public static void main(String[] args) throws Exception {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new Thread(new MyThread(mc1));
        Thread t2 = new Thread(new MyThread(mc2));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);

        t2.start();
    }
}

class MyThread implements Runnable {
    MyClass mc;

    MyThread(MyClass mc) {
        this.mc = mc;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            MyClass.m1();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            MyClass.m2();
        }
    }
}

class MyClass {

    public synchronized static void m1() {
        try {
            // 即使sleep了，但是类的锁仍在m1手里，m2无法运行
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        System.out.println("m1...");
    }

    public synchronized static void m2() {
        System.out.println("m2...");
    }
}
