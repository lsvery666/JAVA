/*
	深入boolean contains(Object o);
*/
import java.util.*;
public class Test03{
	public static void main(String[] args){
		Collection c = new ArrayList();
		String s1 = "abc";
		c.add(s1);
		System.out.println(c.contains(s1));//true
		
		String s2= "abc";
		System.out.println(c.contains(s2));
		
		Manager m1 = new Manager(100,"JACK");
		c.add(m1);
		System.out.println(c.contains(m1));//true
		Manager m2=new Manager(100,"JACK");
		System.out.println(c.contains(m2));//false
		
	}
}
class Manager{
	int no;
	String name;
	Manager(int no,String name){
		this.no = no;
		this.name = name;
	}
	/*
	public boolean equals(Object o){
		if(this==o) return true;
		if(o instanceof Manager){
			Manager m=(Manager)o;
			if(this.no==m.no && this.name==m.name){
				return true;
			}
		}
		return false;
	}
	*/
}