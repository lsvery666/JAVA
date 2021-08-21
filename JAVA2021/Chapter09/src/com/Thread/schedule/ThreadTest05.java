package com.Thread.schedule;

/*
	Thread.sleep(毫秒）
	sleep方法是一个静态方法
	该方法的作用：阻塞当前线程，sleep时间结束，重新转为就绪态
*/

public class ThreadTest05
{
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new MyThread5();
        t1.setName("t1");
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            Thread.sleep(500);
        }
    }
}
class MyThread5 extends Thread
{
    //Thread中的run方法不抛出异常，所以重写run方法之后
    //在run方法的声明位置上不能用throws，只能用try...catch...
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
