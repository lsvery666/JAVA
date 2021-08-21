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

	���³�����ʾȡ�����ӣ����³���ʹ���߳�ͬ�����ƣ����̹߳�ͬ��ͬһ���˻�����ȡ������������ʲô����
*/
public class Test01
{
	public static void main(String[] args){
		Account act = new Account("actno-001",5000.0);
		Processor p = new Processor(act);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
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

	public void withdraw(double money){
		this.balance-=money;
		System.out.println("ȡ��ɹ�����"+this.balance);
	}
}

