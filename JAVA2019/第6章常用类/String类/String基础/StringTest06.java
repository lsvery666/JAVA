public class StringTest06
{
	public static void main(String[] args)
	{
		//���³���ִ�н���֮�󣬻����ַ������������������ַ�������"aaa"��"bbb"�����д���һ���ַ�������"aaabbb"
		String s1 = "aaa";				// ��������
		String s2 = "bbb";				// ��������
		String s3 = s1 + "bbb";			// ����
		String s4 = s1 + s2;			// ����
		String s5 = "aaa" + "bbb";		// �������� �ȼ���String s5 = "aaabbb";
		System.out.println(s3 == s4);	// false
		System.out.println(s4 == s5);	// false
		System.out.println(s3.intern() == s4);	// false
		System.out.println(s3.intern() == s4.intern());	// true
	}
}