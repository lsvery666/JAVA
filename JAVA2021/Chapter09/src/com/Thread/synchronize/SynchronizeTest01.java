package com.Thread.synchronize;

/*
	t1和t2

	异步编程模型：t1线程执行t1的，t2线程执行t2的，两个线程之间谁也不等谁
	同步编程模型：t1线程和t2线程执行，t1线程必须等t2执行结束之后，t1线程才能执行

	什么时候要同步呢？为什么要引入线程同步呢？
		1.为了数据的安全。尽管应用程序的适用率降低，但是为了保证数据是安全的，必须加入线程同步机制
		  线程同步机制使程序变成了（等同）单线程
		2.什么条件下要使用线程同步？
		  第一：必须是多线程环境
		  第二：多线程环境共享同一个数据
		  第三：共享的数据涉及到修改操作

	以下程序演示取款例子，以下程序不使用线程同步机制，多线程共同对同一个账户进行取款操作，会出现什么问题
*/
public class SynchronizeTest01
{
    public static void main(String[] args){
        Account act = new Account("actNo-001",5000.0);
        WithDrawThread p = new WithDrawThread(act);
        Thread t1 = new Thread(p);
        t1.setName("t1");
        Thread t2 = new Thread(p);
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
//取款线程
class WithDrawThread implements Runnable
{
    //账户
    Account act;
    WithDrawThread(Account act){
        this.act = act;
    }
    public void run(){
        act.withdraw(1000.0);
    }
}

class Account
{
    private String actNo;
    private double balance;

    public Account(){}
    public Account(String actNo,double balance){
        this.actNo = actNo;
        this.balance = balance;
    }

    public void setActNo(String actNo){
        this.actNo = actNo;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getActNo(){
        return actNo;
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(double money){
        this.balance -= money;
        System.out.println(Thread.currentThread().getName()+"取款成功，余额：" + this.balance);
    }
}
