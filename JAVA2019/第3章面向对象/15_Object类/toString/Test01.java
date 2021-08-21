/*
	toString()返回JAVA对象的字符串表示形式
	在显示的开发过程中，Object中的toString()方法已经不够用了
	Object中的方法要进行重写
*/

public class Test01{
	public static void main(String[] args){	
		Object o1 = new Object();
		System.out.println(o1);
		System.out.println(o1.toString());//java.lang.Object@161cd475
		
		Person p1 = new Person("刘德华",50);
		System.out.println(p1.toString());//Person[name=刘德华,age=50]
		
		Person p2 = new Person("巩俐",50);	
		//println方法后面括号中如果是一个引用类型，会默认调用引用类型的toString方法
		System.out.println(p2);//Person[name=巩俐,age=50]
		
		Person p3 = new Man("张飞", 50);
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
	//重写toString方法
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