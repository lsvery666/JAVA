/*
	�ֲ��ڲ����ͬ�ھֲ�����
	�ص㣺�ֲ��ڲ����ڷ��ʾֲ�������ʱ�򣬾ֲ���������ʹ��final����
*/
public class OuterClass{
	public void m1(){
		//�ֲ�����
		final int i=10;
		
		//�ֲ��ڲ���
		//�ֲ��ڲ��಻���÷��ʿ���Ȩ�����η�����
		class InnerClass{
			
			//�ֲ��ڲ��಻���о�̬����
			//public static void m1(){}	
			
			public void m2(){
				System.out.println(i);
			}		
		}
		//���������䲻�ܷŵ�main()��
		InnerClass inner= new InnerClass();
		inner.m2();
	}

	public static void main(String[] args){
		OuterClass oc = new OuterClass();
		oc.m1();
	}
}