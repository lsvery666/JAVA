/*
	��java.lang.Integer����Ϊ����������ֻ�����������
*/
public class Test02{
	public static void main(String[] args){
		//��ȡint���͵����ֵ����Сֵ
		System.out.println("int��Сֵ��"+Integer.MIN_VALUE);//int��Сֵ��-2147483648
		System.out.println("int���ֵ��"+Integer.MAX_VALUE);//int���ֵ��2147483647
		
		//����Integer���͵Ķ���
		Integer i1 = Integer.valueOf(10); //int-->Integer
		Integer i2 = Integer.valueOf("123"); //String-->Integer
		System.out.println(i1);//10
		System.out.println(i2);//123
		
		//���³���������ͨ�����������е�ʱ��ᱨ�쳣�����ָ�ʽ���쳣
		//��Ȼ���Խ��ַ���ת����Integer���ͣ����Ǹ��ַ���Ҳ�����������ַ���
		Integer i3 = Integer.valueOf("abc");//NumberFormatException
	}	

}