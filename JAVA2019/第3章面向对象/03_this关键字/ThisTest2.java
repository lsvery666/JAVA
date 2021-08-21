public class ThisTest2{
	public static void main(String[] args){
		Employee e = new Employee(7369, "Smith");
		e.work();
		Employee e1 = new Employee(7370, "FORD");
		e1.work();
		e.m1();
	}
}
class Employee{
	//��Ա����
	int empno;
	String name;
	//���췽��
	Employee(){}

    Employee(int _empno, String _name){
		empno = _empno;
		name = _name;
	}
	//��Ա����
	//this���ڳ�Ա�����У�˭ȥ���������Ա������this�ʹ���˭��thisָ�ľ��ǵ�ǰ����
	public void work(){
		System.out.println(name+"�ڹ���");//this.����ʡ��
		//System.out.prinltn(this.name+"�ڹ���");
	}
	public void m1(){
		//this.m2();
		m2();
	}
	public void m2(){
		System.out.println("TESTING");
	}
}