/*
	某线程正在休眠，如何打断它的休眠
	依靠异常处理机制
*/
public class Test08
{
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new Processor());
		t.setName("t");
		t.start();
		//5s之后
		Thread.sleep(5000);
		//打断睡眠
		t.interrupt();
	}
}
class Processor implements Runnable
{
	public void run(){
		try
		{
			Thread.sleep(100000000000000L);//发生异常
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