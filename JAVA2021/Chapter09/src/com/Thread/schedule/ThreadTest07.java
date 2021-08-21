package com.Thread.schedule;

/*
	如何正确的更好的终止一个正在执行的线程
	需求：线程启动5s之后终止
*/
public class ThreadTest07
{
    public static void main(String[] args) throws Exception{
        MyThread7 mt = new MyThread7();
        Thread t = new Thread(mt);
        t.setName("t");
        t.start();
        //5s之后终止
        Thread.sleep(5000);
        mt.isRun = false;
    }
}
class MyThread7 implements Runnable
{
    boolean isRun = true;
    public void run(){
        for(int i=0;i<10;i++){
            if(isRun){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try{Thread.sleep(1000);}catch(Exception e){}
            }else{
                return;
            }
        }
    }
}

