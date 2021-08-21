//餐厅系统
public class Restaurant{
	public static void main(String[] args){
		//1.顾客
		Customer a=new Customer("张三",5);
		//2.厨师
		Cook b=new Cook("李四");
		//3.菜单 
		Caidan c=a;//多态
		//4.点菜
		String x=c.order(1);
		//5.做菜
		b.cook(x);
	}
}