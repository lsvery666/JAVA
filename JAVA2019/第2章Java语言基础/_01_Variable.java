/*
	变量
	1.JAVA中的变量必须要初始化，没有默认初始化；
	2.作用域大括号
*/
public class _01_Variable{
	
	public static void main(String[] args){
		/*错误：
		for(int i=0;i<2;i++){
			System.out.println(i);
		}
		System.out.println(i);
		*/
		int i = 0;
		for(;i<2;i++){
			System.out.println(i);
		}
		System.out.println(i);
		
	}
	/* 错误
	  public static void m(int a){
			x = a;
			System.out.println(x);
		}
	*/
}
