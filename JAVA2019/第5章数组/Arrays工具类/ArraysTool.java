/*
	Arrays是SUN提供的一个工具类
	java.util.Arrays;
	该工具类主要针对的是数组的操作
	排序，二分查找等
*/
import java.util.Arrays;
public class ArraysTool{
	public static void main(String[] args){
		int[] a = {3,1,2,5,6};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		int index = Arrays.binarySearch(a,1);
		System.out.println(index);//0
		
		int index2 = Arrays.binarySearch(a,15);
		System.out.println(index2);//-6
	}
}