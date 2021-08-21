/*
	t1��t2

	�첽���ģ�ͣ�t1�߳�ִ��t1�ģ�t2�߳�ִ��t2�ģ������߳�֮��˭Ҳ����˭
	ͬ�����ģ�ͣ�t1�̺߳�t2�߳�ִ�У�t1�̱߳����t2ִ�н���֮��t1�̲߳���ִ��

	ʲôʱ��Ҫͬ���أ�ΪʲôҪ�����߳�ͬ���أ�
		1.Ϊ�����ݵİ�ȫ������Ӧ�ó���������ʽ��ͣ�����Ϊ�˱�֤�����ǰ�ȫ�ģ���������߳�ͬ������
		  �߳�ͬ������ʹ�������ˣ���ͬ�����߳�
		2.ʲô������Ҫʹ���߳�ͬ����
		  ��һ�������Ƕ��̻߳���
		  �ڶ������̻߳�������ͬһ������
		  ����������������漰���޸Ĳ���

	���³���ʹ���߳�ͬ�����Ʊ�֤���ݵİ�ȫ
	synchronized�ؼ�����ӵ���Ա�����ϣ��߳����ߵ�Ҳ��this�Ķ�����
*/
public class Test03
{
	public static void main(String[] args){
		Account act=new Account("actno-001",5000.0);
		Processor p=new Processor(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();

	}
}
//ȡ���߳�
class Processor implements Runnable
{
	//�˻�
	Account act;
	Processor(Account act){
		this.act=act;
	}
	public void run(){
		act.withdraw(1000.0);
		
	}
}

class Account
{
	private String actno;
	private double balance;

	public Account(){}
	public Account(String actno,double balance){
		this.actno=actno;
		this.balance=balance;
	}

	public void setActno(String actno){
		this.actno=actno;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public String getActno(){
		return actno;
	}
	public double getBalance(){
		return balance;
	}

	//synchronized�ؼ�����ӵ���Ա�����ϣ��߳����ߵ�Ҳ��this�Ķ�����
	public synchronized void withdraw(double money){
		//����Ҫͬ���Ĵ��룬�ŵ�ͬ��������
		/*
			ԭ��t1�̺߳�t2�߳�

			t1�߳�ִ�е��˴���������synchronized�ؼ��֣��ͻ�ȥ��this�Ķ�����
			����ҵ�this�Ķ������������ͬ��������ִ�г���
			��ͬ�������еĴ���ִ�н���֮��t1�̹߳黹this�Ķ�����

			��t1�߳�ִ��ͬ������Ĺ����У����t2�߳�Ҳ����ִ�����´��룬Ҳ������synchronized�ؼ���
			����Ҳȥ��this�Ķ����������Ǹö�������t1�̳߳���
			ֻ������ȴ�this�������Ĺ黹
		*/
		
			this.balance-=money;
			System.out.println("ȡ��ɹ�����"+this.balance);
		
	}
}

