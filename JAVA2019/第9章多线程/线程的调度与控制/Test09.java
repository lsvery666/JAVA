/*
	�����ȷ�ĸ��õ���ֹһ������ִ�е��߳�
	�����߳�����5s֮����ֹ
*/
public class Test09
{
	public static void main(String[] args) throws Exception{
		Processor p=new Processor();
		Thread t=new Thread(p);
		t.setName("t");
		t.start();
		//5s֮����ֹ
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
