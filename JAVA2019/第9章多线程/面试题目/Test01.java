public class Test01
{
	public static void main(String[] args) throws Exception{
		MyClass mc=new MyClass();
		Processor p=new Processor(mc);

		Thread t1=new Thread(p);
		t1.setName("t1");

		Thread t2=new Thread(p);
		t2.setName("t2");

		t1.start();

		//延迟（保证t1线程先启动）
		Thread.sleep(1000);

		t2.start();
	}
}

class Processor implements Runnable
{
	MyClass mc;
	Processor(MyClass mc){
		this.mc=mc;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("t1")){
			mc.m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			mc.m2();
		}
	}
}
class MyClass 
{
	public synchronized void m1(){
		System.out.println("m1....");
		try
		{
			Thread.sleep(10000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	m2方法的执行不需要等m1的结束，因为m2方法上没有synchronized
	public void m2(){
		System.out.println("m2...");
	}
	*/
	//m2方法的执行需要等m1的结束，因为两个线程共享同一个对象
	public synchronized void m2(){
		System.out.println("m2...");
	}
} 
