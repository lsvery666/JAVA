/*
	SortedMap�е�key�ص㣺���費���ظ������Ǵ��ȥ��Ԫ�ؿ��԰��մ�С�Զ�����
	������Զ�����key���ֵ�Ԫ����Ҫ��ʵ��Comparable�ӿڻ򵥶�дһ���Ƚ���
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		//Map,key�洢��Ʒ��value�洢����
		SortedMap s=new TreeMap();
		//������Ʒ����
		Product p1=new Product("����",1.0);
		Product p2=new Product("ƻ��",4.0);
		Product p3=new Product("����",5.0);
		Product p4=new Product("�㽶",3.0);
		//���
		s.put(p1,8.0);
		s.put(p2,5.0);
		s.put(p3,10.0);
		s.put(p4,2.0);
		//����
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
	//���󣺰�����Ʒ�۸�����
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