/*
	������ϲ�ʹ�÷��ͣ��򼯺��е�Ԫ�����Ͳ�ͬ�⣬�ڱ������ϵ�ʱ��
	ֻ���ó���Object���ͣ���Ҫ��������ǿ������ת����
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
		//���󣺱������ϣ������A���͵���m1()������B���͵���m2()������C���͵�m3()����
		Iterator it = s.iterator();
		while(it.hasNext()){
			Object o=it.next();
			//ֻ����������ǿ������ת��
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