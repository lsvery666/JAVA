/*
	关于数组的拷贝
	
	作业：自己编写一个可以拷贝数组的方法
	
	java.System中提供的方法：
	public static void arraycopy(Object scr,int srcPos,Object dest,int destPos,int length)
	将数组src中从下标srcPos开始的length个元素赋值给数组dest中从下标destPos开始的length个元素
	
	八种基本类型没有继承Object类，因此基本数据类型int[]无法自动转换为Object[]，但String[]可以自动转换为Object[]类型数组
*/
public class ArrayTest8{
	public static void main(String[] args){
		
		int[] a = {1, 23, 4};
		int[] b = {1, 2, 3, 4, 5};
		System.arraycopy(a,0,b,1,3);
		// ArrayCopy(a,0,b,1,3);	// 错误: 不兼容的类型: int[]无法转换为Object[]
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	
	//自己编写的有问题
	public static void ArrayCopy(Object[] a, int x, Object[] b, int y, int l){
		for(int i=0;i<l;i++){
			b[y+i] = a[x+i];
		}
	}
}