/*
	�ַ������õķ���
*/
public class StringTest02{
	public static void main(String[] args){
		//public char charAt(int index){}
		char c1 = "abcdef".charAt(2);
		System.out.println(c1);//c
		
		//public boolean endsWith(String endStr){}
		System.out.println("HelloWorld".endsWith("rld"));//true
		
		//public boolean equalsIgnoreCase(String anotherString){}
		System.out.println("HELLO".equalsIgnoreCase("hello"));//true
		
		//public byte[] getBytes(){}
		byte[] bytes = "��bc".getBytes();
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);
		}//-50 -46 98 99
		
		//public int indexOf(String str){}
		System.out.println("He is a pig.".indexOf("is"));//3
		
		//public int indexOf(String str,int fromIndex){}
		System.out.println("HelloWorldHello".indexOf("Hello",2));//10
		
		//public int lastIndexOf(String str){}
		System.out.println("HelloWorldHello".lastIndexOf("Hello"));//10
		
		//public int lastIndexOf(String str,int fromIndex){}
		System.out.println("HelloWorldHello".lastIndexOf("Hello",8));//0
		System.out.println("HelloWorldHello".lastIndexOf("Hello",11));//10
		
		//public int length(){}
		System.out.println("HelloWorldHello".length());//������length���ԣ�String��length����
		
		//String replace(oldchar, newchar){}
		//String replace(oldstr, newstr){}
		//String replaceAll(String s1,String s2){}
		//ע�⣺�޸ĺ������ַ����������ǽ�ԭ�ַ���ֱ���޸ġ�
		String a = "javaoraclec++javab";
		a.replaceAll("java", "mysql");	
		System.out.println(a);	// javaoraclec++javab
		System.out.println(a.replaceAll("java","mysql"));//mysqloraclec++mysqlvb �������ᴴ���ĸ��ַ���
		
		//String[] split(String s){}
		String myTime="2008,08,08";
		String[] ymd=myTime.split(",");
		for(int i=0;i<ymd.length;i++){
			System.out.println(ymd[i]);
		}//2008 08 08
		
		//boolean startsWith(String s){}
		System.out.println("HelloWorld".startsWith("H"));//true
		
		//String substring(int begin){}
		System.out.println("HelloWorld".substring(3));	// loWorld
		
		//String substring(int beginIndex,int endIndex){}
		System.out.println("HelloWorld".substring(1,4));	// ell
		
		//char[] toCharArray(){}
		char[] c2 = "�������".toCharArray();
		for(int i=0;i<c2.length;i++){
			System.out.println(c2[i]);
		}
		
		//ת���ɴ�д
		System.out.println("HelloWorld".toUpperCase());

        //ת����Сд
		System.out.println("HelloWorld".toLowerCase());

        //String trim(){}
		System.out.println("         HelloWorld           ".trim());

        //Static String valueOf(Object obj){}
		Object o=new Object();
		System.out.println(o);//System.out.println(String.valueOf(o));
	}
}