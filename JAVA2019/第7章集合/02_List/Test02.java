/*
	深入List集合
	ArrayList集合底层是数组，数组是有下标的
	所以ArrayList有很多数组的特性
	
	ArrayList集合底层默认初始化容量是10，扩大之后的容量是原容量的1.5倍
	Vector集合底层默认初始化容量是10，扩大之后的容量是原容量的2倍
	
	如何优化ArrayList和Vector?
		尽量减少扩容操作，因为扩容需要数组拷贝，数组拷贝很耗内存。
		一般推荐在创建集合的时候指定初始化容量
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		List l=new LinkedList();
		l.add(123);
		l.add(321);
		l.add(555);
		l.add(69);
		
		l.add(1,555);
		
		//System.out.println(l.get(0));
		
		//遍历List(List集合特有的遍历方式)
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
	}
}