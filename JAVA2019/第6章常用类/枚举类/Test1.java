/*
	���󣺶���һ���������÷����������Ǽ�������int�������ݵ���
	�������ɹ���÷�������1�����ִ��ʧ����÷�������0
	
	����ִ�гɹ������Ǹó�����ڷ��գ������rturn 0д����return 10�����޷���������
	 
	�����е��������ڱ���׶ν���ģ����Բ�����������ڽ�������Կ����롰ö�����͡�
*/
public class Test1{
	public static void main(String[] args){
		int a = 10;
		int b = 0;
		int retValue = divide(a,b);
		if(retValue == 1){
			System.out.println("�ɹ�");
		}else if(retValue == 0){
			System.out.println("ʧ��");
		}
	}
	public static int divide(int a,int b){
		try{
			int c = a / b;
			return 1;
		}catch(Exception e){
			return 0;
		}
	}
}