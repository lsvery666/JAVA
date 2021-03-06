/*
	Thread三个方法：
		获取当前线程对象public static Thread currentThread(){}
		给线程起名  public void setName(String str){}
		获取线程的名字 public String getName(){}
*/
public class Test04
{
	public static void main(String[] args){
		Thread t = Thread.currentThread();//t保存的内存地址指向的线程是"主线程对象"
		
		Thread t1 = new Thread(new Processor());
		//给线程起名
		t1.setName("t1");
		t1.start();
		
		Thread t2 = new Thread(new Processor());
		t2.setName("t2");
		t2.start();

		//获取线程的名字
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