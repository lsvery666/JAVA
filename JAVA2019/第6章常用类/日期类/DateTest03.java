/*
	��ȡ�ض�������
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest03{
	public static void main(String[] args) throws Exception{
		String strTime = "2008��08��08�� 08:08:08 888";
		//��String��������ת��Ϊ��������Date
		//�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss SSS");
		//���ַ���ת������������
		Date t = sdf.parse(strTime);
		System.out.println(t);
		//Fri Aug 08 08:08:08 CST 2008
 
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").parse("2021/02/25 11:32"));
	}
}