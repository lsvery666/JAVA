/*
	��ͬ��������static����ʱ����ʱ��ͬ���õ����ĸ����أ�
	��̬�����ڼ���ʱ�������࣬��ʱ�п��ܻ�û�и�������Ķ��󣬵��Ǹ�����ֽ����ļ����ؽ��ڴ���Ѿ�����װ���˶������������Ǹ�����ֽ����ļ�����
	���Ծ�̬����ʱ��ֻ��һ��������ڣ���ô��̬ͬ��������ʹ�õ��������
	���������� ����.class

*/
public class Test04
{
	public static void main(String[] args) throws Exception{
		MyClass mc1=new MyClass();
		MyClass mc2=new MyClass();
		Thread t1=new Thread(new Processor(mc1));
		Thread t2=new Thread(new Processor(mc2));
		t1.setName("t1");
		t2.setName("t2");

		t1.start();
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
			MyClass.m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			MyClass.m2();
		}
	}
}
class MyClass
{
	
	public synchronized static void m1(){
		try
		{
			// ��ʹ�߳�sleep�ˣ��������������m1���m2�޷�����
			Thread.sleep(10000);
		}
		catch (Exception e){}
		System.out.println("m1...");
	}
	
	public synchronized static void m2(){
		System.out.println("m2...");
	}
}