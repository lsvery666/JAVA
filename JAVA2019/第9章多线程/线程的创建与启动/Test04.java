/*
	Thread����������
		��ȡ��ǰ�̶߳���public static Thread currentThread(){}
		���߳�����  public void setName(String str){}
		��ȡ�̵߳����� public String getName(){}
*/
public class Test04
{
	public static void main(String[] args){
		Thread t = Thread.currentThread();//t������ڴ��ַָ����߳���"���̶߳���"
		
		Thread t1 = new Thread(new Processor());
		//���߳�����
		t1.setName("t1");
		t1.start();
		
		Thread t2 = new Thread(new Processor());
		t2.setName("t2");
		t2.start();

		//��ȡ�̵߳�����
		for(int i=0;i<100;i++){
			System.out.println(t.getName()+":"+i);
		}
		
		

	}
}
class Processor implements Runnable
{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<100;i++){
			System.out.println(t.getName()+":"+i);
		}
	}
}