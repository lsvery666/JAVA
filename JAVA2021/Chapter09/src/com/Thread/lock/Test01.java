package com.Thread.lock;

/*
Lock lock = new ReentrantLock();        // 可重入锁
try{
    lock.lock();
    doWork();
}finally{
    lock.unlock();
}

Lock是显式锁（手动上锁解锁），synchronized是隐式锁，出了作用域自动释放
Lock只有代码块锁，synchronized有代码块锁和方法锁
使用Lock锁，JVM将花费较少的时间来调度线程，性能更好

 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    public static void main(String[] args) {
        Shop s = new Shop(10);
        for(int i=0;i<10;i++){
            new BuyTicket(s).start();
        }
    }
}

class Shop{
    private int ticketsNum;
    Shop(int num){
        this.ticketsNum = num;
    }
    public void sellTicket(){
        System.out.println("剩余："+--ticketsNum+"张票");
    }
}

class BuyTicket extends Thread{
    Shop s;
    BuyTicket(Shop s){
        this.s = s;
    }

    // 不加static的话，每个线程各有各的锁，加了static才能保证是同一个锁
    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            s.sellTicket();
        }finally {
            lock.unlock();
        }

    }
}
