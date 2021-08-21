package com.Thread.examples;

/*
生产者消费者问题
 */

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;

public class Test01 {

    private static class Cache{
        Integer capacity;
        Integer empty;
        Cache(Integer capacity){
            this.capacity = capacity;
            this.empty = capacity;
        }
    }

    private static class Producer extends Thread{
        String name;
        Cache cache;
        Producer(Cache c, String name){this.cache = c;this.name = name;}

        @Override
        public void run() {
            while(true) {
                synchronized (cache){
                    while(cache.empty.equals(0)){
                        try {
                            System.out.println(name + "阻塞了");
                            cache.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    cache.empty -= 1;
                    System.out.println(name+"："+(cache.capacity-cache.empty)+"个鸡腿");
                    cache.notifyAll();
                }
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
            while(true) {
                synchronized (cache){
                    while(cache.empty.equals(cache.capacity)){
                        try {
                            System.out.println(name + "阻塞了");
                            cache.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    cache.empty += 1;
                    System.out.println(name+"："+(cache.capacity-cache.empty)+"个鸡腿");
                    cache.notifyAll();
                }
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




