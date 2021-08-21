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

		//�ӳ٣���֤t1�߳���������
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
	m2������ִ�в���Ҫ��m1�Ľ�������Ϊm2������û��synchronized
	public void m2(){
		System.out.println("m2...");
	}
	*/
	//m2������ִ����Ҫ��m1�Ľ�������Ϊ�����̹߳���ͬһ������
	public synchronized void m2(){
		System.out.println("m2...");
	}
} 
