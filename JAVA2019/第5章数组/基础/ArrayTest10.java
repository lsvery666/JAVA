/*
	��ά�����ص㣺
		1.��ά������һ�������һά���顣
		2.�����һά���飬���������һά������ÿһ��Ԫ�ض���"һά����"��
*/
public class ArrayTest10{
	public static void main(String[] args){
		//��̬��ʼ����ά����
		int[][] a={{1,2},{2,3},{3,4}};
		
		//��ȡ������������ɶ��ٸ�һά����
		System.out.println(a.length);//3
		
		//��ȡ��һ��һά����
		int[] a0=a[0];
		
		//��ȡ��һ��һά�����еĵ�һ����
		int a00=a[0][0];
		System.out.println(a00);//1
		//System.out.println(a[0][0]);
		
		//��ȡ���һ�������е����һ��Ԫ��
		System.out.println(a[a.length-1][a[a.length-1].length-1]);//4
		
		//�Զ�ά������б���
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
}