/*
	获取特定的日期
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest03{
	public static void main(String[] args) throws Exception{
		String strTime = "2008年08月08日 08:08:08 888";
		//将String类型日期转换为日期类型Date
		//创建日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		//将字符串转换成日期类型
		Date t = sdf.parse(strTime);
		System.out.println(t);
		//Fri Aug 08 08:08:08 CST 2008
 
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").parse("2021/02/25 11:32"));
	}
}