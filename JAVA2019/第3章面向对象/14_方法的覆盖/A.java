/*
	˽�еķ����޷�������
*/

public class A{
	//˽�з���
	private void m1(){
		System.out.println("A'm1 method invoke!");
	}
	//�����ķ���
	public void m2(){
		System.out.println("A'm2 method invoke!");
	}
	public static void main(String[] args){
		//��̬
		A a = new B();
		a.m1();
		a.m2();
	}
}

class B extends A{
	//������д������˽�еķ���
	public void m1(){
		System.out.println("B'm1 method invoke!");
	}
	//��д�����͹����ķ���
	public void m2(){
		System.out.println("B'm2 method invoke!");
	}
}