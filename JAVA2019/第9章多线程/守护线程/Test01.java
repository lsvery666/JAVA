/*
ֻҪ��ǰJVMʵ�����д����κ�һ�����ػ��߳�û�н������ػ��߳̾�ȫ��������ֻ�е����һ�����ػ��߳̽���ʱ���ػ��߳�����JVMһͬ����������
Daemon��������Ϊ�����̵߳������ṩ���������ػ��߳�����͵�Ӧ�þ��� GC (����������)��������һ���ܳ�ְ���ػ��ߡ�
*/
public class Test01
{
	public static void main(String[] args) throws Exception{
		Thread t1=new Processor();
		t1.setName("t1");
		t1.setDaemon(true);
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(1000);
		}
	}

    private void go() {
    }
}
class Processor extends Thread
{
	public void run(){
		int i=0;
		while(true){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			i++;
			try{Thread.sleep(500);}catch(Exception e){}
        }
	}
}