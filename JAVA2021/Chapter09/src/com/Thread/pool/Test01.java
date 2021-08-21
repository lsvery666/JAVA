package com.Thread.pool;

/*
线程池
1. 提高响应速度（减少了创建新线程的时间）
2. 降低资源消耗（重复利用线程池中的线程，不需要每次都创建）
3. 便于线程管理
    corePoolSize    核心池的大小
    maximumPoolSize 最大线程数
    keepAliveTime   线程没有任务时最多保持多长时间后会终止
 */

import java.util.concurrent.*;

public class Test01 {
    public static void main(String[] args) {
        // 创建线程池 参数为线程个数
        ExecutorService es = Executors.newFixedThreadPool(5);

        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());
        es.execute(new MyThread());

        Future<Integer> future = es.submit(new MyTask());

        es.shutdown();

        try {
            if(future.get()!=null){
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyTask implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int i = 0;
        while (i<100) {
            i++;
        }
        return i;
    }
}