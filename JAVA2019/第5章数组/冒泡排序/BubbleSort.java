/*
	ð�������㷨
*/
public class BubbleSort{
	public static void main(String[] args){
		int[] a = {3, 1, 6, 10, 15, 2, 18, 2, 2, 5};

		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
/*
	1.ԭ����
	3 1 6 2 5
	��һ��ѭ��
	1 3 6 2 5
	1 3 6 2 5
	1 3 2 6 5
	1 3 2 5 6

	1 3 2 5
	�ڶ���ѭ��
	1 3 2 5
	1 2 3 5
	1 2 3 5
	
	1 2 3
	������ѭ��
	1 2 3
	1 2 3
	
	1 2
	���Ĵ�ѭ��
	1 2

*/
	
	