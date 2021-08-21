public class StringTest06
{
	public static void main(String[] args)
	{
		//以下程序执行结束之后，会在字符串缓冲区创建两个字符串对象"aaa"、"bbb"，堆中创建一个字符串对象"aaabbb"
		String s1 = "aaa";				// 常量池中
		String s2 = "bbb";				// 常量池中
		String s3 = s1 + "bbb";			// 堆中
		String s4 = s1 + s2;			// 堆中
		String s5 = "aaa" + "bbb";		// 常量池中 等价于String s5 = "aaabbb";
		System.out.println(s3 == s4);	// false
		System.out.println(s4 == s5);	// false
		System.out.println(s3.intern() == s4);	// false
		System.out.println(s3.intern() == s4.intern());	// true
	}
}