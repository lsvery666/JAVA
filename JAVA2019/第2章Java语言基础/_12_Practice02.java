// 对两个变量的数据进行互换，不许用第三方变量
public class _12_Practice02
{
	public static void main(String[] args){
		int a = 3;
		int b = 5;
		swap01(a, b);
		swap02(a, b);
	}

	public static void swap01(int a, int b)
	{	
		System.out.println("交换前：a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("交换后：a = " + a + ", b = " + b);
	}

	public static void swap02(int a, int b)
	{	
		System.out.println("交换前：a = " + a + ", b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("交换后：a = " + a + ", b = " + b);
	}
}