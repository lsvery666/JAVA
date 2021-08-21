package com.Thread.examples;

// 管程法 与Test01类似
public class Test02 {
    private static class Cache{
        int capacity;
        int empty;
        public Cache(int capacity) {
            this.capacity = capacity;
            this.empty = capacity;
        }

        public synchronized void take_away(Consumer c){
            while(empty==capacity){
                System.out.println(c.name+"阻塞了");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty ++;
            System.out.println(c.name+"："+(capacity-empty)+"个鸡腿");
            notifyAll();
        }

        public synchronized void give_back(Producer p){
            while(empty==0){
                System.out.println(p.name+"阻塞了");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            empty --;
            System.out.println(p.name+"："+(capacity-empty)+"个鸡腿");
            notifyAll();
        }
    }

    private static class Producer extends Thread{
        String name;
        Cache cache;
        Producer(Cache c, String name){this.cache = c;this.name = name;}

        @Override
        public void run() {
            while (true){
                cache.give_back(this);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Consumer extends Thread{
        String name;
        Cache cache;
        Consumer(Cache c, String name){this.cache = c;this.name = name;}

        @Override
        public void run() {
            while (true) {
                cache.take_away(this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Cache cache = new Cache(10);
        new Producer(cache, "Producer01").start();
        new Producer(cache, "Producer02").start();
        new Consumer(cache, "Consumer01").start();
        new Consumer(cache, "Consumer02").start();
        new Consumer(cache, "Consumer03").start();
    }

}
