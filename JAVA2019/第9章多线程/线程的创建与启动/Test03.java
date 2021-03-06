/*
	java中实现线程的第二种方式：
		第一步：写一个类实现java.lang.Runnable接口
		第二部：重写run方法

		这种方式是推荐的，因为保留了类的继承
*/
public class Test03
{
	public static void main(String[] args){
		Thread t = new Thread(new Processor());
		t.start();
	}
}
class Processor implements Runnable
{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("run-->"+i);
		}
	}
}