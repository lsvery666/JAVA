//主人类型
public class Person{
	//名字
	String name;
	//喂
	public void feed(Animal a){
		//吃
		System.out.println(name+"喂养");
		a.eat();
	}
}