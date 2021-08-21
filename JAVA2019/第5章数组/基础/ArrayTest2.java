/*
	数组中存储元素的类型是统一的，每一个元素在内存中所占的空间大小是一致的，
	知道数组的首元素内存地址，要查找的元素只要知道下标就可以快速的计算出偏移量
	通过首元素内存地址加上偏移量快速计算出要查找元素的内存地址，通过内存地址快速
	定位该元素，所以数组查找元素的效率较高。
	
	随机的对数组进行增删元素，当增加元素的时候，为了保证数组中元素在空间存储上是有序的，
	所以被添加元素位置后面的所有元素都要向后移动。	删除元素时，后面所有的元素都要向前
	移动，所以数组的增删元素的效率很低。
	
	初始化一维数组有两种方式：
		1.静态初始化
		2.动态初始化
		
*/
public class ArrayTest2{
	public static void main(String[] args){
		int[] a1 = {10, 12, 31};
		System.out.println("第一个元素" + a1[0]);
		System.out.println("最后一个元素是" + a1[a1.length - 1]);
		System.out.println("数组中元素的个数是" + a1.length);

		//数组的遍历
		for(int i=0; i<a1.length; i++){
			System.out.println("第" + (i + 1) + "个元素为" + a1[i]);
		}
		
		//将第二个元素修改为100
		a1[1] = 100;
		
		System.out.println("=======================");
		
		for(int i=0;i<a1.length;i++){
			System.out.println("第"+(i+1)+"个元素为"+a1[i]);
		}
	}
}