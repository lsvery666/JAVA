public class Account{
	//���������
	private String name;
	private double yue;
	
	//���췽��
	Account(){
		System.out.println("Account���޲������췽��ִ��");
	}
	
	public Account(String name,double yue){
		//super();������Object�е��޲������췽��
		this.name=name;
		this.yue=yue;
	}
	
	//��Ա����
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setYue(double yue){
		this.yue=yue;
	}
	public double getYue(){
		return yue;
	}
}