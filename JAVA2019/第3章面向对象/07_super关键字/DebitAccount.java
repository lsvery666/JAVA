public class DebitAccount extends Account{
	//�����������ö�
	private double debit;
	 
	//Constructor
	public DebitAccount(){
		//super();
		super("001",100.0);
		System.out.println("DebitAccount���޲������췽��ִ��");
	}
	/*
	����
	public DebitAccount(String name,double yue,double debit){
		this.name=name;
		this.yue=yue;
		this.debit=debit;
	}
	name��yue��private���ͣ��޷��ٱ�����е��á�
	*/
	public DebitAccount(String name,double yue,double debit){
		super(name, yue);
		this.debit=debit;
		System.out.println("DebitAccount���в������췽��ִ��");
	}
	
	public void setDebit(double debit){
		this.debit=debit;
	}
	public double getDebit(){
		return debit;
	}
	
}