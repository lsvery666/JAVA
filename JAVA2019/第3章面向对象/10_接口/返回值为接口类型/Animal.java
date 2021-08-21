public interface Animal{
	void move();
}
class Cat implements Animal{
	public void move(){
		System.out.println("è���ƶ�");
	}
}
class Dog implements Animal{
	public void move(){
		System.out.println("�����ƶ�");
	}
}