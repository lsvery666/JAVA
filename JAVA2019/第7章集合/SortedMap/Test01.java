/*
	SortedMap中的key特点：无需不可重复，但是存进去的元素可以按照大小自动排列
	如果想自动排序，key部分的元素需要：实现Comparable接口或单独写一个比较器
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		//Map,key存储商品，value存储重量
		SortedMap s=new TreeMap();
		//创建商品对象
		Product p1=new Product("西瓜",1.0);
		Product p2=new Product("苹果",4.0);
		Product p3=new Product("桃子",5.0);
		Product p4=new Product("香蕉",3.0);
		//添加
		s.put(p1,8.0);
		s.put(p2,5.0);
		s.put(p3,10.0);
		s.put(p4,2.0);
		//遍历
		Set keys=s.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
			Object k=it.next();
			Object v=s.get(k);
			System.out.println(k+"-->"+v+"kg");
		}
	}
}
class Product implements Comparable{
	String name;
	double price;
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String toString(){
		return "Product"+name+"price"+price;
	}
	//需求：按照商品价格排序
	public int compareTo(Object o){
		double price1=this.price;
		double price2=((Product)o).price;
		if(price1>price2){
			return 1;
		}else if(price1<price2){
			return -1;
		}else{
			return 0;
		}
	}
}