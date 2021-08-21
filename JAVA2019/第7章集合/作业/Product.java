//��Ʒ
import java.util.*;
public class Product implements Comparable{
	String num;//��Ʒ���
	String name;//��Ʒ����
	double price;//�۸�
	Product(){}
	Product(String num,String name,double price){
		this.num=num;
		this.name=name;
		this.price=price;
	}
	//��дhashCode����
	public int hashCode(){
		return Integer.parseInt(num);
	}
	//��дequals
	public boolean equals(Product o){
		if(this==o){
			return true;
		}
        return (this.name).equals(o.name) && (this.num).equals(o.num) && this.price == o.price;
	}
	//��дcompareTo����
	//����Ʒ�������
	public int compareTo(Object o){
		
		Integer x=Integer.parseInt(this.num);
		Integer y=Integer.parseInt(((Product)o).num);
		if(x<y){
			return -1;
		}else if(x>y){
			return 1;
		}else{
			return 0;
		}
	}
}