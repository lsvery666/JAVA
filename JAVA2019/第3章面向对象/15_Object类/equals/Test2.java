//�Ƚ������ַ����Ƿ�һ�£�������==,Ӧ����equals()
public class Test2{
	public static void main(String[] args){
		String s1 = "ABC";
		String s2 = "ABC";
		System.out.println(s1 == s2);//false,����s1 s2�����ã��Ƚϵ����ڴ��ַ
		System.out.println(s1.equals(s2));//true��String���equals()�Ѿ�����д
		
		String a = "ABC";
		String b = "ABC";
		System.out.println(a == b);//true,����s1 s2���ַ�������
		System.out.println(a.equals(b));//true
	}
}