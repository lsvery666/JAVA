/*
	�����ַ������ù��췽��
*/
public class StringTest01{
	public static void main(String[] args){
		String s1 = "abc";
		System.out.println(s1);
		
		String s2 = "abc";
		System.out.println(s2);
		
		byte[] bytes = {97, 98, 99, 100};
		String s3 = new String(bytes);
		System.out.println(s3);
		
		String s4 = new String(bytes,0,2);
		System.out.println(s4);
		
		char[] c1 = {'��','��','��','��','��'};
		String s5 = new String(c1);
		System.out.println(s5);
		
		String s6 = new String(c1,1,2);
		System.out.println(s6);
	}
}