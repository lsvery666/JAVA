/*
	final���ε����޷����̳�
*/
final class A{}
class B extends A{}

//final���εķ����޷�������
class A{
	public final void m1(){}
}
class B extends A{
	public void m1(){}
}

//final���εı�����һ������
class A{
	public void m1(){
		final int i;
		i = 100;
		
		// i=200; //����
	}
}

//final���εĳ�Ա���������ֶ���ʼ�������ḳĬ��ֵ
class A{
	// ��ʼ������һ��ֱ����ʽ��ʼ��
	final int i = 100;
	
	
	// ��ʼ����������ͨ����ֵ����ʼ��
	final int k;
	A(){
		k = 200;
	}
}

//final���εĳ�Ա����һ���static����
class MyMath{
	//������Java�淶��Ҫ�����еĳ�������д��
	public static final double PI = 3.14;
	
}


