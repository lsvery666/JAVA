/*
	获取Class类型的对象之后，可以创建对应类的对象
*/
public class Test04
{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("Employee");
		//T newInstance(){}
		Object o=c.newInstance();//调用了Employee的无参数构造方法
		System.out.println(o);
	}
}