/*
	日历Calendar
	2021 2.25
*/
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateTest05{
	public static void main(String[] args) throws Exception{
		//获取系统当前日历
		Calendar c = Calendar.getInstance();

		//查看当前日历
		System.out.println(c.get(Calendar.DAY_OF_WEEK));	//5 今天是星期四
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	//25 今天是2.25
		System.out.println(c.get(Calendar.DAY_OF_YEAR));	//56
		
		//获取2008 8-8 是星期几
		String strTime = "2008,08,08";
		Date d = new SimpleDateFormat("yyyy,MM,dd").parse(strTime);
		//Date类型d-->Calendar类型c
		c.setTime(d);
		//获取星期几
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//6
		
		
	}
}