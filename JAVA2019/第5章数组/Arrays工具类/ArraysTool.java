/*
	Arrays��SUN�ṩ��һ��������
	java.util.Arrays;
	�ù�������Ҫ��Ե�������Ĳ���
	���򣬶��ֲ��ҵ�
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