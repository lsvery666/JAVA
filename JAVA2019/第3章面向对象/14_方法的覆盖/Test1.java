/*
	方法的覆盖，也叫方法的重写（override,overwrite)
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
		System.out.println("动物在移动");
	}
}
class Cat extends Animal{
	public void move(){
		System.out.println("猫在走猫步");
	}
}
