//�����˻�
public class DebitAccount extends Account{
	//������
	double debit;
	
	// ��̬����
	static String className = "DebitAccount";

	DebitAccount(){
		System.out.println("DebitAccount���޲ι��췽��ִ��");
	}

	DebitAccount(int num, String name, double debit)
	{
		super(num, name);
		this.debit = debit;
	}

	// �Ǿ�̬����
	public void printInfo()
	{
		System.out.print(className);
		System.out.println(" {num: " + getNum() + ", name: " + name + ", debit: " + debit);
	}

	public void printSuperInfo()
	{
		System.out.print(super.className);
		super.printInfo();
	}
	
	// ��̬����
	public static void m2()
	{
		System.out.println("DebitAccount��m2()����ִ��");
	}

	// ��ֻ̬�ܸ��Ǿ�̬�����߱���̬����
	// ����: DebitAccount�е�m3()�޷�����Account�е�m3()
	// public void m3()
	// {
	//     System.out.println("DebitAccount��m3()����ִ��");
	// }
}