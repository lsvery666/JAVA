/*
	java.math.BigDecimal;
	�����͵����ݾ�ȷ�ȼ��ߣ��ʺ������������
	���������double���;�ȷ��̫�͡�
*/
import java.math.BigDecimal;
public class MathTest1{
	public static void main(String[] args){
		//����������
		BigDecimal v1=new BigDecimal(10);//����һ����ȷ�ȱȽϸߵ�10
		BigDecimal v2=new BigDecimal(10);
		//���ӷ�����
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);//20
	}
}