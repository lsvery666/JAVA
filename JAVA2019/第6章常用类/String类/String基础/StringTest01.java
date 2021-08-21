/*
	java.lang.String���ַ�������
	�ַ���һ���������ɸı䣬"abc"�ַ�������һ�������������ٸı�Ϊ"abcd";
*/
public class StringTest01{
	public static void main(String[] args){

		String a = "abc";
		a = "ab";
		System.out.println(a);//ab,�ײ�����������һ�����ã�aָ��ab��abc������
		//������a����ָ�򣬵���"abc"����������󲻿��ٸı�
		
		String s2 = "hello";
		String s3 = "hello";
		System.out.println(s2==s3);//true

		//���ǱȽ������ַ����Ƿ���ȣ�������"=="
		String s4 = "abc";
		String s5 = "abc";
		System.out.println(s4 == s5);//false
		System.out.println(s4.equals(s5));//true
		System.out.println(s4.intern() == s5.intern());//true
	}
}