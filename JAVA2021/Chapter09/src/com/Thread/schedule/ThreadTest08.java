package com.Thread.schedule;

/*
	Thread.yield()
	该方法是一个静态方法
	给另一个线程让位，让位时间不固定，当前线程由运行态转为就绪态
*/
public class ThreadTest08
{
    public static void main(String[] args){
        Thread t1 = new MyThread8();
        Thread t2 = new MyThread4();
        t1.setName("t1");
        t2.setName("t2");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
class MyThread8 extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            Thread.yield();
        }
    }
}