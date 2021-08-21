//测试程序
import java.util.*;
public class Test{
	public static void main(String[] args){
		//创建超市
		SuperMarket sm=new SuperMarket("兴华");
		//创建商品
		Product apple=new Product("003","苹果",2.0);
		Product apple2=new Product("003","苹果",2.0);
		Product banana=new Product("002","香蕉",3.0);
		Product peach=new Product("001","桃子",4.0);
		//超市添加商品
		sm.addProduct(apple);
		sm.addProduct(apple2);
		sm.addProduct(banana);
		sm.addProduct(peach);
		//创建购物车
		ShoppingCar sc=new ShoppingCar();
		//提示信息
		sm.printmenu();
		boolean open=true;
		while(open){
			Scanner s=new Scanner(System.in);
			Integer choice = Integer.parseInt(s.next());
			switch(choice){
				case 1://选购商品
					System.out.println("==================");
					try{
						sm.showProduct();
					}catch(NoProductException xx){
						System.out.println(xx.getMessage());
					}
					Scanner x1=new Scanner(System.in);
					try{
						Product pp=sm.contains(x1.next());
						System.out.println("请输入选购个数：");
						Scanner x2=new Scanner(System.in);
						Integer no=Integer.parseInt(x2.next());
						if(no==1){
							sc.add(pp);//添加一个商品
						}else if(no>1){
							sc.add(pp,no);//添加n个商品
						}else{
							System.out.println("请输入一个正整数");
						}
					}catch(NoProductException x){
						System.out.println(x.getMessage());
					}
					break;
				case 2://删除购物车商品
					System.out.println("==================");
					System.out.println("请输入要删除的商品编号：");
					Scanner y1=new Scanner(System.in);
					String num=y1.next();
					try{
						Product py=sc.contains(num);
						System.out.println("请输入删除个数(-1表示全部删除)：");
						Scanner y2=new Scanner(System.in);
						Integer noy=Integer.parseInt(y2.next());
						if(noy==1){
							sc.removeOne(num);//删除一个商品
						}else if(noy>=0){
							sc.removeN(num,noy);//删除n个商品
						}else if(noy==-1){
							sc.removeAll(num);//删除该类商品
						}else{
							System.out.println("请输入大于等于-1的正整数");
						}		
					}catch(NoProductException y){
						System.out.println(y.getMessage());
					}catch(LackOfProductException yy){
						System.out.println(yy.getMessage());
					}
					break;
				case 3://显示购物车信息
					System.out.println("==================");
					try{
						sc.printReceipt();
					}catch(NoProductException z){
						System.out.println(z.getMessage());
					}
					break;
				case 4://清空购物车
					System.out.println("==================");
					sc.clear();
					break;
				case 5:
					System.out.println("==================");
					System.out.println("谢谢惠顾！");
					open=false;
					break;
				default:
					System.out.println("输入数字错误，请输入数字1~5！");
					break;
			}
		}
		
	}
	
	
}