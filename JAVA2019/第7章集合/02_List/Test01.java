/*
	List集合存储元素特点：
		1.有序
		2.可重复
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		List l=new ArrayList();//多态
		l.add(10);
		l.add(1);
		l.add(99);
		l.add(100);
		l.add(250);
		l.add(250);
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
