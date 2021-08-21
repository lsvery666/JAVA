/*
	SortedSet集合存储元素为什么可以自动排序?
		TreeSet集合中的元素默认调用Comparable接口的ComparaTo方法进行比较
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		SortedSet s=new TreeSet();
		User u1=new User(10);
		User u2=new User(20);
		User u3=new User(23);
		User u4=new User(13);
		User u5=new User(11);
		s.add(u1);
		s.add(u2);
		s.add(u3);
		s.add(u4);
		s.add(u5);
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class User implements Comparable{
	int age;
	User(int age){
		this.age=age;
	}
	public String toString(){
		return "User[age="+age+"]";
	}
	//实现java.lang.Comparable接口中的compareTo方法
	public int compareTo(Object o){
		if(o instanceof User){
			User u=(User)o;
			if(this.age<u.age){
				return -1;
			}
		}
		return 1;
		
	}
}