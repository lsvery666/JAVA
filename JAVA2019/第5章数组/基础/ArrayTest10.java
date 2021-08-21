/*
	二维数组特点：
		1.二维数组是一个特殊的一维数组。
		2.特殊的一维数组，特殊在这个一维数组中每一个元素都是"一维数组"。
*/
public class ArrayTest10{
	public static void main(String[] args){
		//静态初始化二维数组
		int[][] a={{1,2},{2,3},{3,4}};
		
		//获取以上这个数组由多少个一维数组
		System.out.println(a.length);//3
		
		//获取第一个一维数组
		int[] a0=a[0];
		
		//获取第一个一维数组中的第一个数
		int a00=a[0][0];
		System.out.println(a00);//1
		//System.out.println(a[0][0]);
		
		//获取最后一个数组中的最后一个元素
		System.out.println(a[a.length-1][a[a.length-1].length-1]);//4
		
		//对二维数组进行遍历
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
}