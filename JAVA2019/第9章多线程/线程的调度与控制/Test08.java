/*
	ĳ�߳��������ߣ���δ����������
	�����쳣�������
*/
public class Test08
{
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new Processor());
		t.setName("t");
		t.start();
		//5s֮��
		Thread.sleep(5000);
		//���˯��
		t.interrupt();
	}
}
class Processor implements Runnable
{
	public void run(){
		try
		{
			Thread.sleep(100000000000000L);//�����쳣
			System.out.println("HelloWorld");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}

}