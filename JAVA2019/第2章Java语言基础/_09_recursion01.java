//���õݹ����1~n�ĺͣ��μ��ʼǱ�2-16
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
			System.out.println("��������");
			return 0;
		}
	}
	
}