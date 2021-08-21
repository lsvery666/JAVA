/*
	�����̵߳ĺϲ�
*/
public class Test11
{
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new Processor());
		t.setName("t");
		//t.run(); // ��ӡ����main--->0
		t.start();
		//�ϲ��߳�
		t.join();//t�����̺߳ϲ�
		//���߳�
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
class Processor implements Runnable
{
	public void run(){
		for(int i=0;i<5;i++){
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}