/*
	�߳����ȼ��ߵĻ�ȡ��CPUʱ��Ƭ��Զ�һЩ
	���ȼ���1-10
	���1
	���10
	Ĭ��5

*/
public class Test05
{
	public static void main(String[] args){
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);

		Thread t1 = new Processor();
		t1.setName("t1");
		Thread t2 = new Processor();
		t2.setName("t2");

		System.out.println(t1.getPriority());
		System.out.println(t1.getPriority());

		//�������ȼ�
		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();
	}
}
class Processor extends Thread
{
	public void run(){
		for (int i=0;i<1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}