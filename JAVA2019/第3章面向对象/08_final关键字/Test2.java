//����final
public class Test2{
	public static void main(String[] args){
		final Customer c = new Customer("Jack",15);
		/*
		c=new Customer("LUCKY",20);
		����c��final���εģ��޷����´������󣬵����Ըı����ĳ�Ա����ֵ
		*/
		c.name = "����";
		c.age = 25;
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
 class Customer{
 	String name;
 	int age;
 	Customer(String name,int age){
 		this.name = name;
 		this.age = age;
 	}
 }