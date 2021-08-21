public class Account{
	//姓名和余额
	private String name;
	private double yue;
	
	//构造方法
	Account(){
		System.out.println("Account的无参数构造方法执行");
	}
	
	public Account(String name,double yue){
		//super();调用了Object中的无参数构造方法
		this.name=name;
		this.yue=yue;
	}
	
	//成员方法
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