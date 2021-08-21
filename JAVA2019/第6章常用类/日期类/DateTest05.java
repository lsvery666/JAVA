/*
	����Calendar
	2021 2.25
*/
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateTest05{
	public static void main(String[] args) throws Exception{
		//��ȡϵͳ��ǰ����
		Calendar c = Calendar.getInstance();

		//�鿴��ǰ����
		System.out.println(c.get(Calendar.DAY_OF_WEEK));	//5 ������������
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	//25 ������2.25
		System.out.println(c.get(Calendar.DAY_OF_YEAR));	//56
		
		//��ȡ2008 8-8 �����ڼ�
		String strTime = "2008,08,08";
		Date d = new SimpleDateFormat("yyyy,MM,dd").parse(strTime);
		//Date����d-->Calendar����c
		c.setTime(d);
		//��ȡ���ڼ�
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//6
		
		
	}
}