/*
	Date d=new Date();  获取系统当前时间
	Date d=new Date(long millis);自1970年1月1日开始的毫秒数
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest04{
	public static void main(String[] args){
		Date t1=new Date(1000);
		//将Date转化为String
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		
		//东八区
		System.out.println(sdf.format(t1));//1970,01,01 08:00:01 000
		
		//获取当前系统时间的前十分钟时间
		Date t2=new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(sdf.format(t2));//2018,11,19 20:05:39 030

	}
}