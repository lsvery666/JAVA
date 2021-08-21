/*
	����һά����
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
		//���󣺱������飬����ǹ���ִ��eat�������è��ִ��move
		for(int i=0;i<as.length;i++){
			
			if(as[i] instanceof Dog){
				((Dog)(as[i])).eat();
				System.out.println("��"+(i+1)+"������"+as[i].toString());
			}
			if(as[i] instanceof Cat){
				((Cat)(as[i])).move();
				System.out.println("��"+(i+1)+"������"+as[i].toString());
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
		return "�Ǹ���";
	}
}

class Cat extends Animal{
	public void move(){
		System.out.println("Cat move");
	}
	public String toString(){
		return "�Ǹ�è";
	}
}