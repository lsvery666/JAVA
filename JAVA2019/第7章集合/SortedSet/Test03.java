/*
	��SortedSet����������������һ�ַ�ʽ��java.util.Comparator;
	������дһ���Ƚ���
*/
import java.util.*;
public class Test03{
	public static void main(String[] args){
		//����TreeSet���ϵ�ʱ���ṩһ���Ƚ���
		SortedSet p=new TreeSet(new ProductComparator());
		Product p1=new Product(3.4);
		Product p2=new Product(4.0);
		Product p3=new Product(5.2);
		Product p4=new Product(3.6);
		Product p5=new Product(4.8);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		Iterator it=p.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class Product{
	double price;
	Product(double price){
		this.price=price;
	}
	public String toString(){
		return price+"";
	}
}
//������дһ���Ƚ���
class ProductComparator implements Comparator{
	//���󣺰�����Ʒ�۸�����
	public int compare(Object o1,Object o2){
		double price1=((Product)o1).price;
		double price2=((Product)o2).price;
		if(price1==price2){
			return 0;
		}else if(price1<price2){
			return -1;
		}else{
			return 1;
		}
	}
}