/*
	java�а��ֻ����������Ͷ�Ӧ�İ�װ���ͣ�
	���ֻ����������Ͳ������࣬��˲����ڼ̳�Object��һ˵����
	byte			java.lang.Byte;
	short			java.lang.Short;
	int				java.lang.Integer; 
	long			java.lang.Long;
	float			java.lang.Float;	
	double			java.lang.Double;	
	boolean			java.lang.Boolean;
	char			java.lang.Character;
	
*/
public class Test01{
	//���󣺹涨m1�������Խ���Java���κ�һ����������
	//m1������������byte���͵����ݣ����Խ�byte�����Ȱ�װ��lang.Byte���ٴ��ݲ���
	public static void m1(Object o){//Object o��һ��������������
		System.out.println(o);	
	}
	public static void main(String[] args){
		//������������
		byte b = 10;
		m1(b);//jdk1.5֮�����ֱ�ӽ��������͵����������ʹ����������������͵����鲻�ܱ�Object[]����
		
		//������������
		//Byte b1 = new Byte(b);//�ù��췽���ѹ�ʱ��
		Byte b1 = Byte.valueOf(b);//����byte����b��Byteʵ��
		m1(b1);
	}
}