/*
	����ģʽ��23�����ģʽ����򵥵�һ�����ģʽ
	Ϊ�˽��ʲô���⣿
	Ϊ�˱�֤JAVA�������ĳһ�����͵�JAVA������Զֻ��һ����
	Ϊ�˽�ʡ�ڴ�Ŀ���
*/
public class UserTest{
	public static void main(String[] args){
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		
		//==��������ǻ����������ͣ����ԱȽ����������������Ƿ����
		//==��������������������ͣ���Ƚϵ����ڴ��ַ
		System.out.println(u1==u2);//False
		System.out.println(u2==u3);//Flase
		System.out.println(u3==u4);//Flase
	}
}