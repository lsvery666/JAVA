/*
	������ִ�й����У������Ĵ������⣺
	1.������������
	2.������������
*/
//������������
public class Canshuchuandi{
	public static void m1(int i){
		i++;
		System.out.println("m1--->"+i);//11
	}
	public static void main(String[] args){
		int i=10;
		m1(i);
		System.out.println("main--->"+i);//10 ����i�����ڴ治ͬ
	}
}