package com.Thread.schedule;

/*
	某线程正在休眠，如何打断它的休眠
	依靠异常处理机制
	interrupt()并不是中断某个线程！
	它只是线线程发送一个中断信号，让线程在无限等待时（如死锁时）能抛出异常，从而结束线程；
	但是如果在异常处理中没有结束线程，那么这个线程会继续运行！
*/

public class ThreadTest06
{
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new MyThread6());
        t.setName("t");
        t.start();
        //5s之后
        Thread.sleep(5000);
        //打断睡眠
        t.interrupt();
    }
}
class MyThread6 implements Runnable
{
    public void run(){
        try
        {
            Thread.sleep(100000000000000L);//发生异常
            System.out.println("HelloWorld");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
