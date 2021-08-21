package com.Thread.JMM;

/*
内存模型（Java Memory Model，简称 JMM ）是定义了线程和主内存之间的抽象关系，即 JMM 定义了 JVM 在计算机内存(RAM)中的工作方式。

每个线程创建时JVM都会为其创建一个工作内存(有些地方称为栈空间)，用于存储线程私有的数据，
而Java内存模型中规定所有变量都存储在主内存，主内存是共享内存区域，所有线程都可以访问，
但线程对变量的操作(读取赋值等)必须在工作内存中进行，首先要将变量从主内存拷贝的自己的工作内存空间，
然后对变量进行操作，操作完成后再将变量写回主内存，不能直接操作主内存中的变量，工作内存中存储着主内存中的变量副本拷贝，
前面说过，工作内存是每个线程的私有数据区域，因此不同的线程间无法访问对方的工作内存，线程间的通信(传值)必须通过主内存来完成

主内存
主要存储的是Java实例对象，所有线程创建的实例对象(new出来的)都存放在主内存中，
不管该实例对象是成员变量还是方法中的本地变量(也称局部变量)，当然也包括了共享的类信息、常量、静态变量。
由于是共享数据区域，多条线程对同一个变量进行访问可能会发现线程安全问题。

工作内存
主要存储当前方法的所有本地变量信息(工作内存中存储着主内存中的变量副本拷贝)，
每个线程只能访问自己的工作内存，即线程中的本地变量对其它线程是不可见的，
就算是两个线程执行的是同一段代码，它们也会各自在自己的工作内存中创建属于当前线程的本地变量，
当然也包括了字节码行号指示器、相关Native方法的信息。
注意由于工作内存是每个线程的私有数据，线程间无法相互访问工作内存，因此存储在工作内存的数据不存在线程安全问题。

硬件内存架构：CPU寄存器，CPU缓存，主内存（RAM）

用户线程和内核线程，Java是一对一模型
内核线程(Kernel-Level Thread，KLT)，它是由操作系统内核(Kernel)支持的线程，这种线程是由操作系统内核来完成线程切换，内核通过操作调度器进而对线程执行调度，并将线程的任务映射到各个处理器上

JMM内存模型定义的规则：
    1. 原子性
    2. 可见性
    3. 有序性

指令重排

happens-before原则
    程序顺序规则
    锁规则
    volatile规则
    传递规则
    线程启动原则
    线程中断规则
    线程终止规则
    对象终结规则
 */

public class Test01 {

    public static void main(String[] args) {
        Person p = new Person();
        MyThread t1 = new MyThread(p, "writer");
        MyThread t2 = new MyThread(p, "reader");
        // t2执行结果是不确定的
        t1.start();
        t2.start();
    }

}

class MyThread extends Thread{
    Person p;
    MyThread(Person p, String name){
        super(name);
        this.p = p;
    }
    @Override
    public void run(){
        if(this.getName().equals("writer")){
            p.write();
        }else{
            p.read();
        }
    }
}

class Person{
    int a = 1;
    boolean flag = false;

    /*
    在多线程环境下，可能发生重排序，影响结果，下例中的1和2由于不存在数据依赖关系，则有可能会被重排序，先执行flag=true再执行a=1。
    而此时线程B会顺利到达4处，而线程A中a=1这个操作还未被执行，所以b=a+1的结果也有可能依然等于2。
    */

    public void write(){
        a = 1;          // 1
        flag = true;    // 2
    }

    public void read(){
        if(flag){       // 3
            int i = a + 1;  // 4
            System.out.println(i);
        }
    }
}