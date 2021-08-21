//��̬�ķ��������ڸ���
//��Ϊ��̬������ִ�в���Ҫ����Ĵ��ڣ�ֻ������
public class Test3{
	public static void main(String[] args){
		X x = new Y();
		//��̬�����ײ���á�����.���ķ�ʽ���ã���x��X���ͣ���˲����ڸ���
		X.m1();
	}
}

class X{
	//��̬����
	public static void m1(){
		System.out.println("X's m1 method invoke!");
	}
}
class Y extends X{
	public static void m1(){
		System.out.println("Y's m1 method invoke!");
	}
}