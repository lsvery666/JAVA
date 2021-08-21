/*
	�ַ��������أ�String constant pool��JDK1.8֮��λ�ڶ���
	�ַ������ִ�����ʽ�� 
		��һ�֣�String str1 = "abc";
		�ڶ��֣�String str2 = new String("abc");
		���ڵ�һ�֣��˴�����������String constant pool�д������󣨱����ھ��Ѿ����У���jvm��������String constant pool ��Ѱ���Ƿ��Ѿ�����"abc"���������û���򴴽��ó��������ҽ��˳��������÷��ظ�String a�������ڣ����������"abc" ��������ֱ�ӷ���String constant pool �С�abc�� �����ø�String a�������ڣ���
		���ڵڶ��֣�JVM���ڱ�������ȥString constant pool����"abc"���������������ֱ���ڶ��д���һ��"abc"��ʵ������һ��ָ��������"abc"��һ�����ã������û���������ڳ������д����������ڣ������ڶ��д����������ڣ���
		intern()����������ַ�������ֵ�ڳ������д��ڣ��򷵻����ڳ������еĵ�ַ����������ڣ�������볣���ز����ء�
*/
public class StringTest02{
	public static void main(String[] args){
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s2 == s1);
		System.out.println(s2.intern() == s1.intern());
	}
}