package com.Thread.synchronize;

/*
当synchronized加到成员方法上时，是对this对象加锁
 */

public class SynchronizeTest06 {
    public static void main(String[] args) {
        Person p = new Person("Lisen");
        MyThread6 t = new MyThread6(p);

        Thread t1 = new Thread(t, "sing");
        Thread t2 = new Thread(t, "eat");

        t1.start();
        t2.start();
    }
}

class MyThread6 implements Runnable{
    Person p;
    MyThread6(Person p){
        this.p = p;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("sing")){
            try {
                p.sing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                p.eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Person{
    String name;
    Person(String name){
        this.name = name;
    }

    public synchronized void sing() throws InterruptedException {
        System.out.println(this.name+" is singing.");
        Thread.sleep(5000);
    }

    public synchronized void eat() throws InterruptedException {
        System.out.println(this.name + " is eating.");
        Thread.sleep(5000);
    }
}
