/*
	�ӿ��еĳ�Ա���й̶������η�����������public static final�͵ģ���Ա��������public abstract�͵ġ�
*/
public interface A{
 	
 	//����
    String SUCCESS = "success";
 	double PI = 3.14;
 	
	//��Ա����
    int a = 10;
 	
	//�����г�Ա����
	//public void m(){
	//	System.out.println("m excute!");
	//}
	
	//public static final�ǿ���ʡ�Ե�
 	byte MAX_VALUE = 127;//����
 	
 	//���󷽷� û������
    void m1();
	
	//public abstract�ǿ���ʡ�Ե�
	void m2(); 	
 
 }
 
//����ӿ�֮����Լ̳�
interface B{
	void m1();
}
interface C{
	void m2();
}
interface D{
	void m3();
}
interface E extends B,C,D{
	void m4(); 
}
 