/*
	����һ�³����м����̣߳�

	ֻ��һ���̣߳��������߳�
	main, m1, m2, m3���ĸ�������ͬһ��ջ�ռ���
*/
public class Test01
{
	public static void main(String[] args){
		m1();
	}
	public static void m1(){
		m2();
	}
	public static void m2(){
		m3();
	}
	public static void m3(){
		System.out.println("HelloWorld");
	}
}