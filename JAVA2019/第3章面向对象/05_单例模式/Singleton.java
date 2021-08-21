/*
	ʵ�ֵ���ģʽ
	1.���췽��˽�л�
	2.�����ṩһ�������Ļ�ȡ��ǰ���Ͷ���ķ���
	3.�ṩһ����ǰ���͵ľ�̬����
	����ģʽ��Ϊ���֣�
		����ʽ�������õ�����ʱ�Żᴴ������
		����ʽ������������ؽ׶ξʹ����˶���	
*/
public class Singleton{//����ʽ
	//��̬�����������ʱ�ͱ���������ֻ����һ��
	private static Singleton s = null;
	
	//�����췽��˽�л�
	private Singleton(){}
	
	//�����ṩһ�������Ļ�ȡSingleton����ķ���
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}