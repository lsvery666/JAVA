//����n�Ľ׳ˣ�ʹ�õݹ�Ͳ�ʹ�õݹ�
public class _10_recursion02{
	public static void main(String[] args){
		int n=5;
		System.out.println(chengji(n));
		System.out.println(chengji2(n));
	}

	//��ʹ�õݹ�
	public static int chengji(int n){
		int a=1;
		for(int i=1;i<=n;i++){
			a=a*i;
		}
		return a;
	}

	//ʹ�õݹ�
	public static int chengji2(int n){
		if(n==1){
			return 1;
		}else{
			return chengji2(n-1)*n;
		}
	}
}