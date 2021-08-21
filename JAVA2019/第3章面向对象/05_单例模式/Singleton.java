/*
	实现单例模式
	1.构造方法私有化
	2.对外提供一个公开的获取当前类型对象的方法
	3.提供一个当前类型的静态变量
	单例模式分为两种：
		懒汉式单例：用到对象时才会创建对象
		饿汉式单例：在类加载阶段就创建了对象	
*/
public class Singleton{//懒汉式
	//静态变量在类加载时就被创建，且只创建一次
	private static Singleton s = null;
	
	//将构造方法私有化
	private Singleton(){}
	
	//对外提供一个公开的获取Singleton对象的方法
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}