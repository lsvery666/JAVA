/*
	如何正确的更好的终止一个正在执行的线程
	需求：线程启动5s之后终止
*/
public class Test09
{
	public static void main(String[] args) throws Exception{
		Processor p=new Processor();
		Thread t=new Thread(p);
		t.setName("t");
		t.start();
		//5s之后终止
		Thread.sleep(5000);
		p.isRun=false;
	}
}
class Processor implements Runnable
{
	boolean isRun=true;
	public void run(){
		for(int i=0;i<10;i++){
			if(isRun){
				try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"-->"+i);
			}else{
				return;
			}
		}
	}
}
