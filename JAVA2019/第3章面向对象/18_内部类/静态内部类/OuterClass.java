/*
	���ھ�̬�ڲ��ࣺ
	1.��̬�ڲ�����Ե�ͬ������̬����
	2.�ڲ�����Ҫ������:���Է����ⲿ����˽�е�����
	3.��̬�ڲ������ֱ�ӷ����ⲿ��ľ�̬���ݣ��޷�ֱ�ӷ��ʳ�Ա
*/
public class OuterClass{
	//��̬����
	static String s = "A";
	
	//��Ա����
	private final String s2 = "B";
	
	//��̬����
	private static void m1(){
		System.out.println("static's m1 method excute!");
	}
	
	//��Ա����
	private void m2(){
		System.out.println("static's m2 method excute!");
	}
	
	//��̬�ڲ���
	//������public,protected,private��ȱʡ����
	static class InnerClass{
		
		//��̬����
		public static void m3(){
			System.out.println(s);	
			//System.out.println(s2);
			m1();
			//m2();
		}
		
		//��Ա����
		public void m4(){
			System.out.println(s);
			//System.out.println(s2);
			m1();
			//m2();
		}
		
	}

	public static void main(String[] args){
		InnerClass.m3();
		InnerClass inner = new InnerClass();	// �����������д����ΪInnerClass�Ǿ�̬��
		inner.m4(); 
	}
}