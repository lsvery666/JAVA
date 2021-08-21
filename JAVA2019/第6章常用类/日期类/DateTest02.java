/*
	获取系统当前时间
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest02{
	public static void main(String[] args){
		//获取系统当前时间
		Date nowTime = new Date();
		System.out.println(nowTime);//Mon Nov 19 18:35:25 CST 2018
		//以上程序说明java.util.Date已经重写了Object中的toString方法
		//只不过重写的结果对于中国人讲不太理解
		//所以引入“格式化日期”
		//java.util.Date-->String
		
		/*
			日期格式
			y 年
			M 月
			d 日
			H 小时
			m 分
			s 秒
			S 秒
		*/
		//创建日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss SSS");
		//开始格式化(Date-->String)
		String strTime = sdf.format(nowTime);
		System.out.println(strTime);

		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date()));
	}
}