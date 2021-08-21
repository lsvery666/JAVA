package com.Thread.basic;

/*
第三种方式：
实现Callable  重写call()方法
可以通过Future拿到线程的返回值
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest03 {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        // 创建Callable对象任务
        CallableDemo callTask = new CallableDemo();
        // 提交任务并获取执行结果
        Future<Integer> future = es.submit(callTask);
        // 关闭线程池
        es.shutdown();
        try{
            Thread.sleep(1000);
            System.out.println("主线程在执行其他任务");
            if(future.get()!=null){     // 如果callTask还没有执行完毕，那么get方法就会一直等待
                // 输出获取到的结果
                System.out.println("future.get()-->"+future.get());
            }else{
                System.out.println("future.get()未获取到结果");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("主线程执行完成");
    }
}

class CallableDemo implements Callable<Integer>{
    private int sum;
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable子线程开始计算啦");
        Thread.sleep(2000);
        for (int i = 0; i < 5000; i++) {
            sum += i;
        }
        System.out.println("Callable子线程计算结束啦");
        return sum;
    }
}