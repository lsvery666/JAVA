// ���������������ݽ��л����������õ���������
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
		System.out.println("����ǰ��a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("������a = " + a + ", b = " + b);
	}

	public static void swap02(int a, int b)
	{	
		System.out.println("����ǰ��a = " + a + ", b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("������a = " + a + ", b = " + b);
	}
}