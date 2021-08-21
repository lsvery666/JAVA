/*
	���ڳ�Ա�ڲ��ࣺ
	1.��Ա�ڲ�����Ե�ͬ������Ա����
	2.��Ա�ڲ����в����о�̬����
	3.��Ա�ڲ������ֱ�ӷ����ⲿ������ж���
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
	
	//��Ա�ڲ���
	//������public,protected,private��ȱʡ����
	class InnerClass{
		/*
		//��̬����
		public static void m3(){
			System.out.println(s);
			//System.out.println(s2);
			m1();
			//m2();
		}
		*/
		//��Ա����
		public void m4(){
			System.out.println(s);
			System.out.println(s2);
			m1();
			m2();
		}
		
	}

	public static void main(String[] args){

		//�����ⲿ�����
		OuterClass oc = new OuterClass();

		//�����ڲ������
		InnerClass inner = oc.new InnerClass();	
		// ���ﲻ��д��new InnerClass()����Ϊmain������static�ģ���InnerClass���Ǿ�̬�ģ����Բ���ֱ��new
		
		inner.m4(); 
	}
}