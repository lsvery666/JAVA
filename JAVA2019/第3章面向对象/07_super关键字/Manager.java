//����
public class Manager extends Employee{
	String name = "����";
	//��Ա����
	public void work(){
		System.out.println("�����ڹ���");
	}
	public void m1(){
		//work();
		super.work();
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	/*
	����
	public static void m2(){
		System.out.println(super.name);
	}
	super��thisһ���������ھ�̬�����С�
	*/
}