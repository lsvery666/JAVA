/*
	主人喂养宠物
	多态的作用：
		1.使用多态可以使代码之间的耦合度降低
		2.项目的扩展能力增强
*/
public class Test{
	public static void main(String[] args){
		
		//主人
		Person a = new Person();
	 	a.name = "张三";
		
		//宠物
		Cat b = new Cat();
		
		//主人喂养宠物
		a.feed(b);	//Anima a = new Cat();多态
		
		//如果主人养狗，则建立一个Dog类型，代码扩展以下即可
		Dog d = new Dog();
		a.feed(d);
		
	}
}