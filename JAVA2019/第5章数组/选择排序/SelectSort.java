/*
	ѡ������
	�㷨���ҳ���Сֵ��Ȼ�������Сֵ����ǰ������ݽ���λ��
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
	��һ��ѭ����
	1 3 6 2 5
	
	  3 6 2 5
	�ڶ���ѭ����
	  2 6 3 5
	  
	    6 3 5
	������ѭ����
	    3 6 5
	      
	      6 5
	 ���Ĵ�ѭ����
	      5 6
*/