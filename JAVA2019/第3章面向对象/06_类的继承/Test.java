/*
	���⣺super()��this()�Ƿ����ͬʱ�����ڹ��캯���С�
	�������ֻ����һ�������ڵ�һ�У�����ֻ�ܳ�������һ����

	super()����this():Ϊʲôһ��Ҫ�����ڵ�һ�У�
	��Ϊsuper()����this()���ǵ��ù��캯�������캯�����ڳ�ʼ�������Գ�ʼ���Ķ���Ҫ����ɡ�
*/
public class Test{
	public static void main(String[] args){
		
		DebitAccount a= new DebitAccount();
		/* 
			Account���޲ι��췽��ִ��
			DebitAccount���޲ι��췽��ִ��
		*/
		// ��������й��캯���еĵ�һ�У���ʵ����һ����������super();
		// ���������ڽ��ж����ʼ��ʱ���ȵ��ø���Ĺ��캯���������ᴴ������Ķ��󣩣�����������ʵ�������̡�
	
		DebitAccount b = new DebitAccount(20, "Tom", 10.0);
		b.printInfo();
		b.printSuperInfo();

		b.setNum(1);
		//System.out.println(b.num);���������޷�ֱ�ӷ��ʸ����е�˽�б���
		//�����Լ�ӷ���
		System.out.println(b.getNum());
	
		b.m2();
		// b.super.m2();	// ����: �Ҳ�������
		Account.m2();	// ������า���˸���ķǾ�̬�������޷�������ͨ������Ķ���ȥ���ø���ķǾ�̬����

	}
}