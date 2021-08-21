/*
	������Set�����д洢��Ԫ�أ���Ԫ�ص�hashCode��equals����
	�洢��HashSet���ϻ���HashMap����key���ֵ�Ԫ�أ���Ҫͬʱ��дhashCode��equals����
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		//��������
		Set s=new HashSet();
		//���Ԫ��
		Employee e1=new Employee("JACK",1000);
		Employee e2=new Employee("JACK",1000);
		Employee e3=new Employee("SUN",1002);
		Employee e4=new Employee("JIM",2000);
		Employee e5=new Employee("COOK",3000);
		Employee e6=new Employee("SMITH",3001);
		
		System.out.println(e1.hashCode());
		System.out.println(e1.hashCode());
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		
		System.out.println(s.size());//5 ��дhashCode֮ǰ��6
	}
}
//������ʵ��ҵ���߼���֪���ù�˾Ա������ǣ�1000-9999
class Employee{
	String name;
	int num;
	Employee(String name,int num){
		this.name=name;
		this.num=num;
	}
	//��дhashCode()����
	public int hashCode(){
		return num/1000;
	}
	//��дequals����
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Employee){
			Employee e=(Employee)o;
			return this.name.equals(e.name) && this.num == e.num;
		}
		return false;
	}
	
}