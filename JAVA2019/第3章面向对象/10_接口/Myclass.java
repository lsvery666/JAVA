 //һ�������ʵ�ֶ���ӿ�,����Ƿǳ����࣬��Ҫ�����󷽷���д
 //implements��ʵ�ֵ���˼����һ���ؼ��֣���extends������ͬ
 public class Myclass implements A{
 	public void m1(){
		System.out.println("m1 excute!");
	}
 	public void m2(){
		System.out.println("m2 excute!");
	}
	public static void main(String[] args){
		
		A a = new Myclass();

		System.out.println(a.a);

		// a.a = 100;//�޷�Ϊ���ձ���a����ֵ
		
		a.m1();

		a.m2();

	}
 }
 
 class F implements B, C{
 	public void m1(){}
 	public void m2(){}
 }
 