/*
    1.class �ؼ���ǰ�� abstract
	2.�������޷���ʵ����
	3.��Ȼ������û�а취ʵ���������ǳ�����Ҳ�й��췽�����ù��췽���Ǹ����ഴ�������õġ�
	4.�������п��Զ�����󷽷�
	���󷽷����﷨���ڷ��������η��б������abstract�ؼ��֣����ҳ��󷽷�Ӧ���ԡ����������ܴ��С�{}��
	5.�������в�һ���г��󷽷��������󷽷�ֻ�ܶ����ڳ������С�
	6.һ���ǳ������Ҫ�̳г����࣬���뽫�������еĳ��󷽷�����
	7.����ؼ���abstract����Щ�����Թ��棿final, private, static 
*/
public abstract class A{
	//��Ա����
	public int a = 10;
	//Constructor
	A(){
		System.out.println("A....");
	}
	
	//���󷽷�
	public abstract void m1();
	
	//�ǳ��󷽷�
	public void m2(){
		
		System.out.println("m2 excutes!");

	}

	public static void main(String[] args){
		//�������޷���������
		//A a = new A();
		
		//��̬
		A a = new B();
	}
}