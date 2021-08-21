/*
	Thread.yield()
	该方法是一个静态方法
	给同一个优先级的线程让位，但是让位时间不固定
*/
public class Test10
{
	public static void main(String[] args){
		Thread t = new Processor();
		t.setName("t");
		t.start();
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
class Processor extends Thread
{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			if(i%20==0){
				Thread.yield();
			}
		}
	}
}
