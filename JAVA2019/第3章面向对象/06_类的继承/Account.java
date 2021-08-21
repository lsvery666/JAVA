
//�˻�����
public class Account{
	// ˽�г�Ա����
	// �˺�
	private int num;

	// ��˽�г�Ա����
	// ����
	String name;

	// ��̬����
	static String className = "Account";
	
	//���췽��
	Account(){
		System.out.println("Account���޲ι��췽��ִ��");
	}//���û��������췽������Test.java����ͨ���������лᱨNoSuchMethodError

	Account(int num, String name){
		this.num=num;
		this.name = name;
	}

	//��Ա����
	public void setNum(int num){
		this.num=num;
	}
	public int getNum(){
		return num;
	}
	
	// �Ǿ�̬����
	public void printInfo()
	{
		System.out.println(" {num: " + num + ", name: " + name);
	}
	
	// ��̬����
	public static void m2()
	{
		System.out.println("Account��m2()����ִ��");
	}

	public static void m3()
	{
		System.out.println("Account��m2()����ִ��");
	}
}
