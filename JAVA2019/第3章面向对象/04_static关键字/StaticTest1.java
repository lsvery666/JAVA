/*
	static ����ľ�̬����������ؽ׶�ִ�У����������϶��µ�˳��ִ�еġ�
	���������ĳ�ʼ������̬�����������ļ��ض�ִ�У�����ִֻ��һ�Σ�new ��������ִֻ��һ�Σ���
	�������������ͬһ���У�������������ִ�С�
*/
public class StaticTest1{
	
	public static void main(String[] args){
		System.out.println("main excute!");
	}

	//��̬����
	static{
		System.out.println("1");
	}
	static{
		System.out.println("2");
	}
	static{
		System.out.println("3");
	}
	static{
		System.out.println("4");
	}

	/* 
		java StaticTest1
		1
		2
		3
		4
		main excute!
	*/
}

class StaticTest1_
{
	public static void main(String[] args){
		StaticTest1 s1 = new StaticTest1();
		StaticTest1 s2 = new StaticTest1();
		/* 
			java StaticTest1_
			1
			2
			3
			4
		*/
	}
}