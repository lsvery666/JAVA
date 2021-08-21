package com.Thread.basic;

/*
	java中实现线程的第二种方式：
		第一步：写一个类实现java.lang.Runnable接口
		第二部：重写run方法

		这种方式是推荐的，因为保留了类的继承
*/
public class ThreadTest02
{
    public static void main(String[] args){
        Thread t = new Thread(new MyThread2());
        t.start();
    }
}
class MyThread2 implements Runnable
{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("run-->"+i);
        }
    }
}
