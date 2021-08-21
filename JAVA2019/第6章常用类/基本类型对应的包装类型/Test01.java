/*
	java中八种基本数据类型对应的包装类型：
	八种基本数据类型并不是类，因此不存在继承Object这一说法。
	byte			java.lang.Byte;
	short			java.lang.Short;
	int				java.lang.Integer; 
	long			java.lang.Long;
	float			java.lang.Float;	
	double			java.lang.Double;	
	boolean			java.lang.Boolean;
	char			java.lang.Character;
	
*/
public class Test01{
	//需求：规定m1方法可以接受Java中任何一种数据类型
	//m1方法如果想接受byte类型的数据，可以将byte类型先包装成lang.Byte，再传递参数
	public static void m1(Object o){//Object o是一个引用数据类型
		System.out.println(o);	
	}
	public static void main(String[] args){
		//基本数据类型
		byte b = 10;
		m1(b);//jdk1.5之后可以直接将基础类型当成引用类型传进来，但基本类型的数组不能被Object[]接收
		
		//引用数据类型
		//Byte b1 = new Byte(b);//该构造方法已过时，
		Byte b1 = Byte.valueOf(b);//返回byte类型b的Byte实例
		m1(b1);
	}
}