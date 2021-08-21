/*
	�������ָ�ʽ����Java.text.DecimalFormat;
		���ָ�ʽ��Ԫ�أ�
		# ��������
		, ǧ��λ
		. С����
		0 ������0
*/
import java.text.DecimalFormat;
public class MathTest{
	public static void main(String[] args){
		//1.�������ָ�ʽ������
		//���󣺼���ǧ��λ
		DecimalFormat df=new DecimalFormat("###,###");
		//��ʼ��ʽ��
		System.out.println(df.format(1234567));//1,234,567
		
		//���󣺼���ǧ��λ��������λС��
		DecimalFormat df1=new DecimalFormat("###,###.##");//1,234,567.12
		System.out.println(df1.format(1234567.123));
		
		//���󣺼���ǧ��λ������4λС�������Ҳ�����0
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.123));//1,234,567.1230
	}
}