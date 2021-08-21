package com.Thread.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
使用Thread.setDefaultUncaughtExceptionHandler
 */

public class Test03 {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandle());
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new MyThread2());
        es.shutdown();
    }
}
