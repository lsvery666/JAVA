package com.Thread.exception;

/*
子线程如果抛出了运行时异常，主线想要捕获
通过线程池的ThreadFactory为线程设置UncaughtExceptionHandler
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Test02 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool(new MyThreadFactory());
        es.execute(new MyThread2());
        es.shutdown();
        System.out.println("main done.");
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = -20; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            if(i == 0) {
                throw new RuntimeException();
            }
        }
    }
}

class MyUncaughtExceptionHandle implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+": "+e);
    }
}

class MyThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        System.out.println("create thread t");
        Thread t = new Thread(r);
        System.out.println("set uncaughtExceptionHandle for t");
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandle());
        return t;
    }
}
