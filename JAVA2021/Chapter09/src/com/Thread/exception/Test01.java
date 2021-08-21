package com.Thread.exception;

/*
子线程发生异常，主线程不会停止
子线程中发生非RuntimeException时，不能向上抛出，只能用try...catch...
如果在运行过程中满足了某种条件导致线程必须中断，可以选择使用抛出运行级别异常来处理throw RuntimeException
 */

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = -20; i < 20; i++) {
//            int t = 10 / i;
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = -20; i < 20; i++) {
            // Error
//            if(i == 0){
//                throw new OutOfMemoryError();
//            }

            // RuntimeException
//            int t = 10 / i;

            // IOException
            if(i == 0) {
                File f = new File("test");
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
