/*
	二分法查找
	1.二分法查找是建立在已经排序的基础之上的。
	要求快速找出数组中某元素的下标。
*/
public class Test{
	public static void main(String[] args){
		int[] a = {1,23,5,8,21,7};

		bubbleSort(a);

		System.out.println(binarySearch(a, 7));
		System.out.println(binarySearch(a, 9));
	}
	
	public static void bubbleSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if (a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

	}

	public static int binarySearch(int[] a, int num)
	{
		int low = 0;
		int high = a.length - 1;
		int middle = 0;	

		if (a[low] > num || a[high] < num || low > high)
		{
			return -1;
		}
		
		while(low<=high)
		{
			middle = (low & high) + ((low ^ high) >> 1);	// 安全防溢出求均值
			if(a[middle] < num)
			{
				low = middle + 1;
			}else if (a[middle] > num)
			{
				high = middle - 1;
			}else {
				return middle;
			}
		}

		return -1;
	}
}