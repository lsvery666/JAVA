//购物车
import java.util.*;
public class ShoppingCar{
	HashMap<Product,Integer> products=new HashMap<Product,Integer>();
	ShoppingCar(){}//构造一个空的购物车
	//添加一个商品
	public void add(Product p){
		products.put(p,1);
		System.out.println("选购成功，您可继续选择服务！");
	}
	//添加N个商品
	public void add(Product p,Integer n){
		products.put(p,n);
		System.out.println("选购成功，您可继续选择服务！");
	}
	//购物车是否包含该商品
	public Product contains(String num) throws NoProductException{
		Set<Product> keys=products.keySet();
		Iterator<Product> it=keys.iterator();
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
				throw new NoProductException("您的购物车中没有该商品，请重新选择服务！");
			}
		}else{
			try{
				return null;
			}finally{
				throw new NoProductException("您的购物车中没有该商品，请重新选择服务！");
			}
		}
	}
	//删除一类商品
	//通过编号删除
	public void removeAll(String num) throws NoProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			products.remove(pro);
			System.out.println("删除成功，您可继续选择服务！");
		}
	}
	//删除一个商品
	public void removeOne(String num) throws NoProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			int m0=products.get(pro);
			if(m0==1){
				products.remove(pro);
				System.out.println("删除成功，您可继续选择服务！");
			}else{
				products.put(pro,m0-1);
				System.out.println("删除成功，您可继续选择服务！");
			}
		}
	}
	//删除N个商品
	public void removeN(String num,int n) throws NoProductException,LackOfProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			int m0=products.get(pro);
			if(m0>=n){
				products.put(pro,m0-n);
				System.out.println("删除成功，您可继续选择服务！");
			}else{
				throw new LackOfProductException("您的购物车中只有"+products.get(pro)+"个"+pro.name+"，请重新选择服务！");
			}
		}
		
	}
	//清空购物车
	public void clear(){
		products.clear();
		System.out.println("您的购物车已被清空，您可继续选择服务！");
	}
	//显示购物信息
	public void printReceipt() throws NoProductException{
		Set<Product> keys=products.keySet();
		Iterator<Product> it=keys.iterator();
		if(it.hasNext()){
			double sum=0;
			System.out.println("您的购物车包含以下商品：");
			while(it.hasNext()){
				Product p=it.next();
				Integer v=products.get(p);
				sum=sum+v*p.price;
				System.out.println(p.num+"号商品"+p.name+":"+v+"个 共"+(v*p.price)+"元");
			}
			System.out.println("您的购物车中商品总价"+sum+"元！");
			System.out.println("请重新选择服务！");
		}else{
			throw new NoProductException("您的购物车为空！请重新选择服务！");
		}
		
	}
}