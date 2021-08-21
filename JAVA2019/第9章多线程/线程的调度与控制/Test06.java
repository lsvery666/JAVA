/*
	Thread.sleep(���룩
	sleep������һ����̬����
	�÷��������ã�������ǰ�߳�,�ڳ�CPU���ø������߳�
*/
public class Test06
{
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Processor();
		t1.setName("t1");
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);
		}
	}
}
class Processor extends Thread
{
	//Thread�е�run�������׳��쳣��������дrun����֮��
	//��run����������λ���ϲ�����throws��ֻ����try...catch...
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}