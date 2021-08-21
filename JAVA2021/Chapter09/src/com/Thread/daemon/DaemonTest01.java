package com.Thread.daemon;

/*
只要当前JVM实例中尚存在任何一个非守护线程没有结束，守护线程就全部工作；只有当最后一个非守护线程结束时，守护线程随着JVM一同结束工作。
Daemon的作用是为其他线程的运行提供便利服务，守护线程最典型的应用就是 GC (垃圾回收器)，它就是一个很称职的守护者。
*/
public class DaemonTest01 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new DaemonThread();
        t1.setName("t1");
        t1.setDaemon(true);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            Thread.sleep(1000);
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            i++;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
