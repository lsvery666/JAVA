/*
	�����ĸ��ǣ�Ҳ�з�������д��override,overwrite)
*/
public class Test1{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
	}
}
class Animal{
	String name;
	public void move(){
		System.out.println("�������ƶ�");
	}
}
class Cat extends Animal{
	public void move(){
		System.out.println("è����è��");
	}
}
