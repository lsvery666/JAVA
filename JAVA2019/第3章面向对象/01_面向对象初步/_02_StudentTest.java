// ��Ա��������Ĭ�ϳ�ʼ��ֵ
public class _02_StudentTest{
	public static void main(String[] args){
		_01_Student stu1=new _01_Student();
//		stu1.id = 100;
//		stu1.age = 15;
//		stu1.addr = "����";
//		stu1.name = "����";
//		stu1.sex = true;
		System.out.println(stu1.id);	// 1
		System.out.println(stu1.age);	// 0
		System.out.println(stu1.sex ? "��" : "Ů");		// Ů
		System.out.println(stu1.addr);	// null
		System.out.println(stu1.name);	// null
	}
}