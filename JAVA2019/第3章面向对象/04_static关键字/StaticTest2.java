/*
	ʵ������	��������ʵ���ĳ�ʼ����Ҳ��Ϊ��������
	ÿ�ε��ù��췽��ǰ��ִ��һ��,ע����ù��췽��ʱ���Ὣ����м��أ���ֻ����һ�Σ�
	��˵�һ�ε��ù��췽������ִ�о�̬���飬��ִ��ʵ�����飬��ִ�й��췽����
	�ڶ��ε���ʱ����ִ�о�̬���飬���ǻ�ִ��ʵ�����飬��ִ�й��췽����
*/
public class StaticTest2{

	int age = 0;
	
	//�޲������췽��
	StaticTest2(){
		System.out.println("�޲������췽��ִ�У�");
	}

	//ʵ������
	{
		age = 1;
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	{
		System.out.println("3");
	}

	//��̬����
	static{
		// age = 1;	// ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� age
		System.out.println("A");
	}

	public static void main(String[] args){
		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();
		StaticTest2 s3 = new StaticTest2();
		System.out.println(s1.age);	// 1
		System.out.println(s2.age);	// 1
		System.out.println(s3.age); // 1
		/*
		A
		1
		2
		3
		�޲������췽��ִ�У�
		1
		2
		3
		�޲������췽��ִ�У�
		1
		2
		3
		�޲������췽��ִ�У�
		*/
	}
}