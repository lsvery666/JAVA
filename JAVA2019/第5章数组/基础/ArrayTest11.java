//二维数组的动态初始化
public class ArrayTest11{
	public static void main(String[] args){
		//创建一个3*4的二维数组
		int[][] a=new int[3][4];
		//遍历
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
		System.out.println("==============");
		//给一个元素赋值
		a[1][2]=10;
		//遍历
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print('\n');
		}
		
	}
}