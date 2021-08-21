package com.Thread.synchronize;

/*
synchronized有三种用法：
1. 普通同步方法（实例方法），锁是当前实例对象 ，进入同步代码前要获得当前实例的锁
2. 静态同步方法，锁是当前类的class对象 ，进入同步代码前要获得当前类对象的锁
3. 同步方法块，锁是括号里面的对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁
*/
public class SynchronizeTest03 {
    public static void main(String[] args) {
        Account3 act = new Account3("actNo-001", 5000.0);
        WithDrawThread3 p = new WithDrawThread3(act);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();

    }
}

//取款线程
class WithDrawThread3 implements Runnable {
    //账户
    Account3 act;

    WithDrawThread3(Account3 act) {
        this.act = act;
    }

    public void run() {
        act.withdraw(1000.0);
    }
}

class Account3 {
    private String actNo;
    private double balance;

    public Account3() {
    }

    public Account3(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public double getBalance() {
        return balance;
    }

    //synchronized关键字添加到成员方法上，线程拿走的是this的对象锁
    public synchronized void withdraw(double money) {
        //把需要同步的代码，放到同步语句块中
		/*
			原理：t1线程和t2线程

			t1线程执行到此处，遇到了synchronized关键字，就会去找this的对象锁
			如果找到this的对象锁，则进入同步语句块中执行程序
			当同步语句块中的代码执行结束之后，t1线程归还this的对象锁

			在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到了synchronized关键字
			所以也去找this的对像锁，但是该对象锁被t1线程持有
			只能在这等待this对象锁的归还
		*/

        this.balance -= money;
        System.out.println("取款成功，余额：" + this.balance);

    }
}


