public class Test07
{
	public static void main(String[] args) throws Exception{
		Thread t=new Processor();
		t.setName("t");
		t.start();
		Thread.sleep(5000);
		System.out.println("HelloWorld!");
	}
}
class Processor extends Thread
{
	public void run(){
		for(int i=0;i<200;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
