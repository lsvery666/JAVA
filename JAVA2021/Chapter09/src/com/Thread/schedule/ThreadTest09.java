package com.Thread.schedule;

/*
	关于线程的合并
*/
public class ThreadTest09
{
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new MyThread9());
        t.setName("t");
        //t.run(); // 打印的是main--->0
        t.start();
        //等待t结束
        t.join();//t和主线程合并
        //主线程
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class MyThread9 implements Runnable
{
    public void run(){
        for(int i=0;i<5;i++){
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
