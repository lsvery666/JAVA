/*
	toString()����JAVA������ַ�����ʾ��ʽ
	����ʾ�Ŀ��������У�Object�е�toString()�����Ѿ���������
	Object�еķ���Ҫ������д
*/

public class Test01{
	public static void main(String[] args){	
		Object o1 = new Object();
		System.out.println(o1);
		System.out.println(o1.toString());//java.lang.Object@161cd475
		
		Person p1 = new Person("���»�",50);
		System.out.println(p1.toString());//Person[name=���»�,age=50]
		
		Person p2 = new Person("����",50);	
		//println�������������������һ���������ͣ���Ĭ�ϵ����������͵�toString����
		System.out.println(p2);//Person[name=����,age=50]
		
		Person p3 = new Man("�ŷ�", 50);
		System.out.println(p3);//1
	}
}

class Person{
	String name;
	int age;
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	//��дtoString����
	public String toString(){
		return "Person[name="+name+",age="+age+"]";
	}
}

class Man extends Person{
	Man(String name, int age)
	{
		super(name, age);
	}
	public String toString(){
		return "Man[name="+name+",age="+age+"]";
	}
}