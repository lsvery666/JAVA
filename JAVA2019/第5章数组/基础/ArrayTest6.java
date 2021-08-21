//方法调用时数组的传递
public class ArrayTest6{
	public static void main(String[] args){
		//第一种方式
		int[] a = {1, 2, 3, 4, 5};
		m1(a);
		
		//第二种方式
		m1(new int[]{1, 2, 3, 4, 5});

		// m1({1, 2, 3, 4, 5});		// 错误：非法的表达式开始
	}

	public static void m1(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}