public class Employee
{
	private String name;
	public Employee(){
		System.out.println("Employee���޲������췽��ִ��");		
	}
	public Employee(String name){
		this.name=name;
	}
	public void work(){
		System.out.println(name+"�ڹ���");
	}
}