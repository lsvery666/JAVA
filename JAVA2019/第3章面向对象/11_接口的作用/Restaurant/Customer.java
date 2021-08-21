//顾客
public class Customer implements Caidan{
	//姓名
	String name;
	//座位号
	int seatnum;
	//构造方法
	Customer(String name,int seatnum){
		this.name=name;
		this.seatnum=seatnum;
	}
	//点菜 1--宫保鸡丁 2--鱼香肉丝
	public String order(int x){
		if(x==1){
			System.out.println(seatnum+"号位顾客"+name+"点了"+a+"菜");
			return a; 
		}else if(x==2){
			System.out.println(seatnum+"号位顾客"+name+"点了"+b+"菜");
			return b;
		}else{
			System.out.println("没有这道菜");
			return null;
		}
	}
}