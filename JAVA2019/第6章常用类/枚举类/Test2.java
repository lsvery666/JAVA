/*
	���󣺶���һ���������÷����������Ǽ�������int�������ݵ���
	�������ɹ���÷�������1�����ִ��ʧ����÷�������0
	
	����ִ�гɹ������Ǹó�����ڷ��գ������rturn 0д����return 10�����޷���������
	 
	�����е��������ڱ���׶ν���ģ����Բ�����������ڽ�������Կ����롰ö�����͡�
*/
public class Test2{
	public static void main(String[] args){
		int a = 10;
		int b = 0;
		Result retValue = divide(a,b);
		if(retValue == Result.SUCCESS){
			System.out.println("�ɹ�");
		}else if(retValue == Result.FAIL){
			System.out.println("ʧ��");
		}
		
	}
	public static Result divide(int a,int b){
		try{
			int c = a / b;
			return Result.SUCCESS;
		}catch(Exception e){
			return Result.FAIL;
		}
	}
}
//����һ��ö������
enum Result{//�ؼ���enum ��ʶ��Result
	//�ɹ���ʧ��
	//�淶Ҫ�󣺴�д
	SUCCESS, FAIL
}
//�ļ�
enum Season{
	SPRING, SUMMER, AUTUMN, WINTER
}
//��ɫ
enum Color{
	GREEN, BLUE, RED
}