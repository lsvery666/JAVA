public class StringTest05
{
	public static void main(String[] args)
	{
		//���³���ִ�н���֮�󣬻����ַ������������������ַ�������"aaa"��"bbb"��"aaabbb"�����д���һ���ַ�������"aaabbb"
		String s1 = "aaa";				// ��������
		String s2 = "bbb";				// ��������
		String s3 = s1 + s2;			// ����
		String s4 = "aaabbb";			// ��������
		String s5 = "aaa" + "bbb";		// �������� �ȼ���String s5 = "aaabbb";
		System.out.println(s3 == s4);	// false
		System.out.println(s3.intern() == s4);	// true
		System.out.println(s4 == s5);	// true
	}
}