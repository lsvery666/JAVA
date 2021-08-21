public class Test3{
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "hello";
		method_1(s1,s2);
		System.out.println(s1+"...."+s2); //java....hello
		
		StringBuilder s11 = new StringBuilder("java");
		StringBuilder s22 = new StringBuilder("hello");
		method_2(s11,s22);
		System.out.println(s11+"-----"+s22); //javahello-----hello
	}

	public static void method_1(String s1, String s2){
		// s1, s2是局部变量 实际字符串没有变
		s1.replace('a','k');
		System.out.println(s1);	// java
		s1 = s2;
		System.out.println(s1);	// hello
	}

	public static void method_2(StringBuilder s1,StringBuilder s2){
		// 虽然s1,s2也是局部变量，但是实际字符串变了
		s1.append(s2);
		System.out.println(s1);	// javahello
		s1 = s2;
		System.out.println(s1);	// hello
	}
}
