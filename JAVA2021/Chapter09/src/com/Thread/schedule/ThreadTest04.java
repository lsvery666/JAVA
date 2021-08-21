package com.Thread.schedule;

/*
	线程优先级高的获取的CPU时间片相对多一些
	优先级：1-10
	最低1
	最高10
	默认5
*/

public class ThreadTest04
{
    public static void main(String[] args){
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        Thread t1 = new MyThread4();
        t1.setName("t1");
        Thread t2 = new MyThread4();
        t2.setName("t2");

        System.out.println(t1.getPriority());
        System.out.println(t1.getPriority());

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
class MyThread4 extends Thread
{
    public void run(){
        for (int i=0;i<1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}