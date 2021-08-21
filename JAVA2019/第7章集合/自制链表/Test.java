package myChain;
public class Test{
	public static void main(String[] args){
		Person a=new Person("张三",10,1);
		Person b=new Person("李四",15,2);	
		PersonChain p=new PersonChain();
		p.addNode(a);
		p.addNode(b);
		p.printAll();
	}
	
}