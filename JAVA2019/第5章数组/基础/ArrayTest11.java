//��ά����Ķ�̬��ʼ��
public class ArrayTest11{
	public static void main(String[] args){
		//����һ��3*4�Ķ�ά����
		int[][] a=new int[3][4];
		//����
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
		System.out.println("==============");
		//��һ��Ԫ�ظ�ֵ
		a[1][2]=10;
		//����
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
		
	}
}