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
		// s1, s2�Ǿֲ����� ʵ���ַ���û�б�
		s1.replace('a','k');
		System.out.println(s1);	// java
		s1 = s2;
		System.out.println(s1);	// hello
	}

	public static void method_2(StringBuilder s1,StringBuilder s2){
		// ��Ȼs1,s2Ҳ�Ǿֲ�����������ʵ���ַ�������
		s1.append(s2);
		System.out.println(s1);	// javahello
		s1 = s2;
		System.out.println(s1);	// hello
	}
}
