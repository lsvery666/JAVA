/*
	«≥øΩ±¥”Î…ÓøΩ±¥
*/
public class ArrayTest9{
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4};
		int[] b = shallowcopy(a);
		int[] c = deepcopy(a);

		printarray(a);
		printarray(b);
		printarray(c);

		System.out.println(a==b);	// true
		System.out.println(a==c);	// false

		System.out.println(a.equals(b));	// true
		System.out.println(a.equals(c));	// false
	}

	public static int[] shallowcopy(int[] a)
	{
		return a;
	}

	public static int[] deepcopy(int[] a)
	{
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		return b;
	}

	public static void printarray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}