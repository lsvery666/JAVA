/*
	t1和t2

	异步编程模型：t1线程执行t1的，t2线程执行t2的，两个线程之间谁也不等谁
	同步编程模型：t1线程和t2线程执行，t1线程必须等t2执行结束之后，t1线程才能执行

	什么时候要同步呢？为什么要引入线程同步呢？
		1.为了数据的安全。尽管应用程序的适用率降低，但是为了保证数据是安全的，必须加入线程同步机制
		  线程同步机制使程序编程了（等同）单线程
		2.什么条件下要使用线程同步？
		  第一：必须是多线程环境
		  第二：多线程环境共享同一个数据
		  第三：共享的数据涉及到修改操作

	以下程序演示取款例子，以下程序不使用线程同步机制，多线程共同对同一个账户进行取款操作，会出现什么问题
*/
public class Test01
{
	public static void main(String[] args){
		Account act = new Account("actno-001",5000.0);
		Processor p = new Processor(act);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		t1.start();
		t2.start();

	}
}
//取款线程
class Processor implements Runnable
{
	//账户
	Account act;
	Processor(Account act){
		this.act=act;
	}
	public void run(){
		act.withdraw(1000.0);
		
	}
}

class Account
{
	private String actno;
	private double balance;

	public Account(){}
	public Account(String actno,double balance){
		this.actno=actno;
		this.balance=balance;
	}

	public void setActno(String actno){
		this.actno=actno;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public String getActno(){
		return actno;
	}
	public double getBalance(){
		return balance;
	}

	public void withdraw(double money){
		this.balance-=money;
		System.out.println("取款成功，余额："+this.balance);
	}
}

