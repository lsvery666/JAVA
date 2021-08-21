//信用账户
public class DebitAccount extends Account{
	//信誉度
	double debit;
	
	// 静态变量
	static String className = "DebitAccount";

	DebitAccount(){
		System.out.println("DebitAccount的无参构造方法执行");
	}

	DebitAccount(int num, String name, double debit)
	{
		super(num, name);
		this.debit = debit;
	}

	// 非静态方法
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
	
	// 静态方法
	public static void m2()
	{
		System.out.println("DebitAccount的m2()方法执行");
	}

	// 静态只能覆盖静态，或者被静态覆盖
	// 错误: DebitAccount中的m3()无法覆盖Account中的m3()
	// public void m3()
	// {
	//     System.out.println("DebitAccount的m3()方法执行");
	// }
}