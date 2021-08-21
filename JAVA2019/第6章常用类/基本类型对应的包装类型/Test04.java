/*
	String
	int
	Integer
	��������ת��

	String	->	int:		Integer.parseInt(str)
	String	->	Integer:	Integer.valueOf(str)
	int		->	String:		Integer.toString(int) �� String.valueOf(int)
	int		->	Integer:	Integer.valueOf(int)
	Integer ->	String:		Integer.toString(Int) �� Int.toString() �� String.valueOf(Int)
	Integer ->	int:		Int.intValue()
*/
public class Test04{
	public static void main(String[] args){
		//int-->Integer
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);
		
		//Integer-->int
		// int i2 = Integer.parseInt(i1);	// ����: �����ݵ�����: Integer�޷�ת��ΪString
		// int i2 = Integer.intValue(i1);	// �����޷����� Integer�еķ��� intValueӦ�õ���������;
		int i2 = i1.intValue();
		System.out.println(i2);
		
		//String-->Integer
		Integer i3 = Integer.valueOf("123");
		System.out.println(i3);
		
		//Integer-->String
		//String s1 = String.valueOf(i1);
		//String s1 = i1.toString();
		String s1 = Integer.toString(i1);
		System.out.println(s1);
		
		//int-->String
		//String s2 = String.valueOf(10);
		String s2 = Integer.toString(10);
		System.out.println(s2);
		
		//String-->int
		int i4 = Integer.parseInt("123");
		System.out.println(i4);
	}
}