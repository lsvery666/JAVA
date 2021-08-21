//传递二维数组
public class ArrayTest12{
	public static void main(String[] args){
		m1(new int[][]{{1,2},{2,3},{3,4}});
	}
	public static void m1(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
}