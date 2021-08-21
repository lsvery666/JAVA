/*
	JDK5.0�����ԣ�
	���µ������ʺ�JDK1.5�汾֮��ģ�����1.5
	JDK1.4������1.4����֮ǰ�����а汾����ʹ��һ������
	
	�Զ�װ�䣨auto_boxing)���Զ�����(auto_unboxing)
*/
public class Test05{
	public static void main(String[] args){
		Integer i3 = 10;//�Զ�װ��
		int i4 = i3;//�Զ�����
		System.out.println(i3+1);//11
		System.out.println(i4+1);//11
		//JDK5.0֮��
		m1(321);//�Զ�װ��
		System.out.println(m2(10,5)+1);//�Զ�װ��

		Integer i5 = 5;
		Integer i6 = 5;
		System.out.println(i5 == i6);	// true

		Integer i7 = Integer.valueOf(5);
		Integer i8 = Integer.valueOf(5);
		System.out.println(i7 == i8);	// true
		System.out.println(i6 == i7);	// true
		
		// �ù��췽����ʱ
		Integer i9 = new Integer(5);
		Integer i10 = new Integer(5);
		System.out.println(i9 == i10);	// false
	}
	public static void m1(Object o){
		System.out.println(o);
	}
	public static int m2(Integer i1,Integer i2){
		return i1-i2;//�Զ�����
	}
}