/*
	深入一维数组
*/
public class ArrayTest5{
	public static void main(String[] args){
		Animal[] as = new Animal[4];
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		as[0] = d1;
		as[1] = d2;
		as[2] = c1;
		as[3] = c2;
		//需求：遍历数组，如果是狗，执行eat，如果是猫，执行move
		for(int i=0;i<as.length;i++){
			
			if(as[i] instanceof Dog){
				((Dog)(as[i])).eat();
				System.out.println("第"+(i+1)+"个动物"+as[i].toString());
			}
			if(as[i] instanceof Cat){
				((Cat)(as[i])).move();
				System.out.println("第"+(i+1)+"个动物"+as[i].toString());
			}
		}
	}
}

class Animal{
	
}

class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat");
	}
	public String toString(){
		return "是个狗";
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("Cat move");
	}
	public String toString(){
		return "是个猫";
	}
}