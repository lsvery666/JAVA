/*
	JDK5.0新特性：
	以下的特性适合JDK1.5版本之后的，包括1.5
	JDK1.4，包括1.4在内之前的所有版本不能使用一下特性
	
	自动装箱（auto_boxing)和自动拆箱(auto_unboxing)
*/
public class Test05{
	public static void main(String[] args){
		Integer i3 = 10;//自动装箱
		int i4 = i3;//自动拆箱
		System.out.println(i3+1);//11
		System.out.println(i4+1);//11
		//JDK5.0之后
		m1(321);//自动装箱
		System.out.println(m2(10,5)+1);//自动装箱

		Integer i5 = 5;
		Integer i6 = 5;
		System.out.println(i5 == i6);	// true

		Integer i7 = Integer.valueOf(5);
		Integer i8 = Integer.valueOf(5);
		System.out.println(i7 == i8);	// true
		System.out.println(i6 == i7);	// true
		
		// 该构造方法过时
		Integer i9 = new Integer(5);
		Integer i10 = new Integer(5);
		System.out.println(i9 == i10);	// false
	}
	public static void m1(Object o){
		System.out.println(o);
	}
	public static int m2(Integer i1,Integer i2){
		return i1-i2;//自动拆箱
	}
}