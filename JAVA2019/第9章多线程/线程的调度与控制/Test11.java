/*
	关于线程的合并
*/
public class Test11
{
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new Processor());
		t.setName("t");
		//t.run(); // 打印的是main--->0
		t.start();
		//合并线程
		t.join();//t和主线程合并
		//主线程
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