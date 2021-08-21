package com.Thread.examples;

/*
读者写者问题
读进程优先
 */

import java.util.concurrent.Semaphore;

public class Test03 {

    static int readCount = 0;                          // 读者数量
    static Semaphore countMutex = new Semaphore(1); // readCount的互斥锁
    static Semaphore rwMutex = new Semaphore(1);    // 读写的互斥锁

    private static class Writer extends Thread{

        public Writer(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    rwMutex.acquire();
                    System.out.println(this.getName() + "正在写");
                    Thread.sleep(1000);
                    System.out.println(this.getName() + "写完了");
                    rwMutex.release();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Reader extends Thread{
        public Reader(String name) {
            super(name);
        }

        @Override
        public void run() {
            while(true) {
                try {
                    countMutex.acquire();
                    if (readCount == 0) {
                        rwMutex.acquire();
                    }
                    readCount++;
                    countMutex.release();
                    System.out.println(this.getName() + "正在读");
                    Thread.sleep(500);
                    System.out.println(this.getName() + "读完了");
                    countMutex.acquire();
                    readCount--;
                    if (readCount == 0) {
                        rwMutex.release();
                    }
                    countMutex.release();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Writer("Writer01").start();
        new Writer("Writer02").start();
        new Reader("Reader01").start();
        new Reader("Reader02").start();
        new Reader("Reader03").start();
        new Reader("Reader04").start();
    }

}


