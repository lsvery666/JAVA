//利用递归计算1~n的和，参见笔记本2-16
public class _09_recursion01{
	public static void main(String[] args){
		System.out.println(sum(5));
	}
	
	public static int sum(int n){
		
		if(n>0){
			return sum(n-1)+n;
		}else if(n==0){
			return 0;
		}else{
			System.out.println("参数错误！");
			return 0;
		}
	}
	
}