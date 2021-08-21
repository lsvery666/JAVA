/*
	如果集合不使用泛型，则集合中的元素类型不同意，在遍历集合的时候，
	只能拿出来Object类型，需要做大量的强制类型转换。
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		Set s=new HashSet();
		A a=new A();
		B b=new B();
		C c=new C();
		s.add(a);
		s.add(b);
		s.add(c);
		//需求：遍历集合，如果是A类型调用m1()方法，B类型调用m2()方法，C类型调m3()方法
		Iterator it = s.iterator();
		while(it.hasNext()){
			Object o=it.next();
			//只能做大量的强制类型转换
			if(o instanceof A){
				((A)o).m1();
			}else if(o instanceof B){
				((B)o).m2();
			}else{
				((C)o).m3();
			}
		}
	}
}
class A{
	public void m1(){
		System.out.println("HelloWorld");
	}
}
class B{
	public void m2(){
		System.out.println("HelloWorld");
	}
}
class C{
	public void m3(){
		System.out.println("HelloWorld");
	}
}