/*
	������ִ�й����У������Ĵ������⣺
	1.������������
	2.������������
*/
//������������
public class Canshuchuandi2{
	public static void m1(Animal a){
		a.age++;
		System.out.println("m1--->"+a.age);//11
	}
	public static void main(String[] args){
		Animal a = new Animal(10);
		m1(a);
		System.out.println("main--->"+a.age);//11 ָ��ָ��Ķ��������ֵ�ı�
	}
}
class Animal{
	int age;
	Animal(int _age){
		age=_age;
	}
}