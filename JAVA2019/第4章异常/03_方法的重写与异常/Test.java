/*
	1：当子类覆盖父类的方法时，如果父类的方法抛出了异常，那么子类的方法要么不抛出异常要么抛出父类异常或者该异常的子类，不能抛出其他异常。
	2：如果父类抛出了多个异常，那么子类在覆盖时只能抛出父类的异常的子集。

	注意：
	如果父类或者接口中的方法没有抛出过异常，那么子类是不可以抛出异常的，如果子类的覆盖的方法中出现了异常，只能try不能throws。
	如果这个异常子类无法处理，已经影响了子类方法的具体运算，这时可以在子类方法中，通过throw抛出RuntimeException异常或者其子类，这样，子类的方法上是不需要throws声明的。
*/
import java.io.*;
//class A{
//	public void m1(){}
//}
//class B extends A{
//	public void m1() throws Exception{}
//}

//class C{
//	public void m1() throws FileNotFoundException{}
//}
//class D extends C{
//	public void m1() throws IOException{}
//}

class E{
	public void m1() throws IOException{}
}
class F extends E{
	public void m1() throws FileNotFoundException{}
}

