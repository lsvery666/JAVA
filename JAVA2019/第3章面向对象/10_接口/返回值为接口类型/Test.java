//返回值类型为接口类型
public class Test{
	public static void main(String[] args){
		Animal a = getAnimal();
		Cat c = (Cat)(getAnimal());
		// Dog d = (Dog)(getAnimal());	
		// java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
		a.move();
		c.move();
		
	}
	public static Animal getAnimal(){
		Animal a = new Cat();
		return a;
	}
}
