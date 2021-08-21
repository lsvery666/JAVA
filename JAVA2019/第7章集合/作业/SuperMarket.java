//超市
import java.util.*;
public class SuperMarket{
	//超市名
	String name;
	//商品
	TreeSet<Product> products=new TreeSet<Product>();//按商品编号排序
	SuperMarket(String name){
		this.name=name;
	}
	//添加商品
	public void addProduct(Product p){
		products.add(p);
	}
	//展示商品信息
	public void showProduct() throws NoProductException{
		Iterator<Product> it=products.iterator();
		if(it.hasNext()){
			System.out.println("您可输入编号选购以下商品：");
			while(it.hasNext()){
				Product p=it.next();
				System.out.println(p.num+"号商品 "+p.name+"价格"+p.price+"元/个");
			}
			System.out.println("==================");
		}else{
			throw new NoProductException("没有商品可供选购！请重新选择服务！");
		}
	}
	//超市是否有该商品
	public Product contains(String num) throws NoProductException{
		Iterator<Product> it=products.iterator();
		if(it.hasNext()){
			while(it.hasNext()){
				Product p=it.next();
				if((p.num).equals(num)){
					return p;
				}
		   }
		   try{
		   	return null;
		   }finally{
		   	throw new NoProductException("超市中没有该商品！请重新选择服务！");
		   }
		   
		}else{
			try{
				return null;
			}finally{
				throw new NoProductException("超市中没有该商品！请重新选择服务！");
			}
			
		}
	}
	
	//提示信息
	public void printmenu(){
		System.out.println("欢迎来到"+this.name+"超市!");
		System.out.println("您可选择以下服务：");
		System.out.println("==================");
		System.out.println("1.选购商品");
		System.out.println("2.删除商品");
		System.out.println("3.查看购物车");
		System.out.println("4.清空购物车");
		System.out.println("5.退出系统");
	}
}