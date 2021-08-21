package com.Thread.schedule;

/*
wait()
Obj.wait()与Obj.notify()必须要与synchronized(Obj)一起使用，也就是wait,与notify是针对已经获取了Obj锁的线程进行操作；
从语法角度来说，Obj.wait(),Obj.notify必须在synchronized(Obj){...}语句块内。
从功能角度来说，wait就是说线程在获取对象锁后，主动释放对象锁，同时本线程休眠。直到有其它线程调用对象的notify()唤醒该线程，才能继续获取对象锁，并继续执行。
相应的notify()就是对对象锁的唤醒操作。
但有一点需要注意的是notify()调用后，并不是马上就释放对象锁的，而是在相应的synchronized(){}语句块执行结束，自动释放锁后，JVM会在wait()对象锁的线程中随机选取一线程，赋予其对象锁，唤醒线程，继续执行。
这样就提供了在线程间同步、唤醒的操作。Thread.sleep()与Object.wait()二者都可以暂停当前线程，释放CPU控制权，主要的区别在于Object.wait()在释放CPU同时，释放了对象锁的控制。
 */

/*
任务：三个线程分别负责打印“A”，“B”，“C”，要求按顺序交替打印A B C十次
 */
public class ThreadTest10 {
    public static void main(String[] args) throws InterruptedException {
        Object A = new Object();
        Object B = new Object();
        Object C = new Object();

        ThreadPrinter t1 = new ThreadPrinter("A", C, A);
        ThreadPrinter t2 = new ThreadPrinter("B", A, B);
        ThreadPrinter t3 = new ThreadPrinter("C", B, C);
        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}

class ThreadPrinter extends Thread{
    String name;
    Object prev;
    Object self;

    public ThreadPrinter(String name, Object prev, Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run(){
        int count = 10;
        while(count>0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                if(count>0) {
                    try {
                        // prev.wait()调用，释放该线程对prev的对象锁，并且进入等待池中
                        prev.wait();
                        // 当prev.notify()调用，并且执行完其所在线程的程序后，JVM会在prev对象锁的锁池中随机选取一线程，赋予其prev锁，唤醒线程，继续执行。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
