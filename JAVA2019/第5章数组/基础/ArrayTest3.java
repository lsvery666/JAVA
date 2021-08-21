/*动态初始化
	动态初始化一维数组，会先在堆内存中分配这个数组，并且数组中每一个元素都采用默认值
	println(a) a为引用，若a为空指针，直接输出null，若a不为空指针，则输出a.toString
	而如果采用println(a.toString()) a为引用，若a为空指针，会在运行时发生空指针异常
*/

public class ArrayTest3{
	public static void main(String[] args){
		
		//动态声明一个int类型的数组，最多可以存储四个元素
		int[] a1 = new int[4];
		
		//遍历
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		//赋值
		a1[0] = 21;
		a1[1] = 22;
		a1[2] = 23;
		a1[3] = 24;
		
		//再次遍历
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		//引用类型的数组
		Object[] objs = new Object[3];
		
		/*第一种遍历方法
		for(int i=0;i<objs.length;i++){
			System.out.println(objs[i]);
		}
		编译通过，运行结果为：
		null
		null
		null
		*/
		
		System.out.println("============");//分割线
		
		/*第二种遍历方法
		for(int i=0;i<objs.length;i++){
			Object o = objs[i];
			System.out.println(o.toString());
		}
		编译通过，运行结果为：
		Exception in thread "main" java.lang.NullPointerException
        at ArrayTest3.main(ArrayTest3.java:26)
      */
      
      System.out.println("============");//分割线
      
      /*第三种遍历方法
      for(int i=0;i<objs.length;i++){
			Object o = objs[i];
			System.out.println(o);
		}
		编译通过，运行结果为：
		null
		null
		null
		*/
		
		 System.out.println("============");//分割线
		 
		//第四种遍历方法
		for(int i=0;i<objs.length;i++){
			objs[i] = new Object();
			System.out.println(objs[i]);
		}
		/*编译通过，运行结果为：
		java.lang.Object@161cd475
		java.lang.Object@532760d8
		java.lang.Object@57fa26b7
		*/
	}
}