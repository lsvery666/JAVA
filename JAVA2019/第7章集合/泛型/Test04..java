/*
	SortedSet集合使用泛型
*/
import java.util.*;
public class Test04{
	public static void main(String[] args){
		SortedSet<Manager> s=new TreeSet<Manager>();
		
		Manager m1=new Manager(1000.0);
		Manager m2=new Manager(1500.0);
		Manager m3=new Manager(1300.0);
		
		s.add(m1);
		s.add(m2);
		s.add(m3);
		
		Iterator<Manager> it =s.iterator();
		while(it.hasNext()){
			Manager m=it.next();
			System.out.println(m);
		}
	}
}
class Manager implements Comparable<Manager>{
	double sal;
	Manager(double sal){
		this.sal=sal;
	}
	public String toString(){
		return sal+"";
	}
	public int compareTo(Manager m){
		double sal1=this.sal;
		double sal2=m.sal;
		if(sal1>sal2){
			return 1;
			
		}else if(sal1<sal2){
			return -1;
		}else{
			return 0;
		}
	}
}