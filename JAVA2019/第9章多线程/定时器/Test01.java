/*
	关于定时器的应用
	作用：每隔一段固定的时间执行一段代码
*/
import java.util.*;
import java.text.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//1.创建定时器
		Timer t=new Timer();
		//2.指定定时任务
		//t.schedule(TimerTask task,Date firstTime,long period);
		t.schedule(new LogTimerTask(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2018-12-01 19:50:01 000"),10*1000);

	}
}
class LogTimerTask extends TimerTask
{
	public void run(){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}