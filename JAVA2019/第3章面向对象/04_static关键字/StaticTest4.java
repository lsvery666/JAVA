/*
	��̬�������洢�ڷ����������е�JAVA��������һ�ݣ����Ծ�̬�������༶��ģ����á�����.���ķ�ʽ���ʡ�
	�������������еĶ����У�����������Ե�ֵ����ͬ�ģ�������������ƾ�̬������
	��Ա�������ڴ�������ʱ���ʼ��
	��̬������������ؽ׶θ�ֵ����ֻ��ֵһ��
*/
public class StaticTest4{
	public static void main(String[] args){
		Animal a1 = new Animal("AAA",10);
		Animal a2 = new Animal("BBB",11);
		//���á�����.���ķ�ʽ����
		System.out.println(Animal.type);
		//Ҳ����ʹ�á�����.��
		System.out.println(a1.type);
		
		Animal a3 = null;
		System.out.println(a3.type);//������ֿ�ָ���쳣
	}
}

//������ʵ�����еġ�½��������
class Animal{
	//Field
	//��Ա������һ������һ�ݣ�
	//��Ա�����ڴ�������ʱ��ʼ�������Ҵ洢�ڶ��е�ÿһ��������
	String name;
	int age;
	static String type = "½��";//�洢�ڷ�����
	//��̬�������洢�ڷ����������е�JAVA��������һ��
	//���Ծ�̬�������༶��ģ����á�����.���ķ�ʽ����
	//Constructor
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
}