/*
	�����Զ�װ����Զ����䣺
		1.�Զ�װ����Զ������ǳ������׶ε�һ������ͳ��������޹ء�
		2.�Զ�װ����Զ�������ҪĿ���Ƿ������Ա���롣
*/
public class Test06{
	public static void main(String[] args){
		//�����������(-128~127)֮�䣬JAVA��������һ��"���ͳ�����"
		//�����ͳ�����ֻ�洢-128~127֮�������
		
		Integer i1 = 100;//������򲻻��ڶ��д�������
		Integer i2 = 100;
		System.out.println(i1==i2);//true 
		
		Integer i3 = -128;
		Integer i4 = -128;
		System.out.println(i3==i4);//true 
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5==i6);//false
		
		Integer i7 = Integer.valueOf(128);
		Integer i8 = Integer.valueOf(128);
		System.out.println(i7==i8);//false 
		
		Integer i9 = Integer.valueOf(100);
		Integer i10 = Integer.valueOf(100);
		System.out.println(i9==i10);//true

		int a = 3;
		int b = a;
		System.out.println(a==b);	// true																																																
		a = 4;
		System.out.println(a==b);	// false
		System.out.println(b);		// 3

		Integer x = 3;
		Integer y = x;
		System.out.println(x==y);	// true
		x = 4;	// xָ������һ�����󣬶����ǽ�3�ĳ���4
		System.out.println(x==y);	// false
		System.out.println(y);		// 3
	}
}