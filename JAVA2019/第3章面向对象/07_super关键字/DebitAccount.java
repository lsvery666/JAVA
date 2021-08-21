public class DebitAccount extends Account{
	//独特属性信用度
	private double debit;
	 
	//Constructor
	public DebitAccount(){
		//super();
		super("001",100.0);
		System.out.println("DebitAccount的无参数构造方法执行");
	}
	/*
	错误：
	public DebitAccount(String name,double yue,double debit){
		this.name=name;
		this.yue=yue;
		this.debit=debit;
	}
	name和yue是private类型，无法再别的类中调用。
	*/
	public DebitAccount(String name,double yue,double debit){
		super(name, yue);
		this.debit=debit;
		System.out.println("DebitAccount的有参数构造方法执行");
	}
	
	public void setDebit(double debit){
		this.debit=debit;
	}
	public double getDebit(){
		return debit;
	}
	
}