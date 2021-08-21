/*
	选择排序
	算法：找出最小值，然后这个最小值和最前面的数据交换位置
*/
public class SelectSort{
	public static void main(String[] args){
		int[] a={3,1,6,2,5};
	
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for(int j=i;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}
/*
	3 1 6 2 5
	第一次循环：
	1 3 6 2 5
	
	  3 6 2 5
	第二次循环：
	  2 6 3 5
	  
	    6 3 5
	第三次循环：
	    3 6 5
	      
	      6 5
	 第四次循环：
	      5 6
*/