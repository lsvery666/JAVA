//厨师
public class Cook{
	//姓名
	String name;
	//构造方法
	Cook(String name){
		this.name=name;
	}
	//做菜
	public void cook(String a){
		System.out.println("厨师"+name+"正在做"+a+"菜");
	}
}