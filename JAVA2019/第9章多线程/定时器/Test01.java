/*
	���ڶ�ʱ����Ӧ��
	���ã�ÿ��һ�ι̶���ʱ��ִ��һ�δ���
*/
import java.util.*;
import java.text.*;
public class Test01
{
	public static void main(String[] args) throws Exception{
		//1.������ʱ��
		Timer t=new Timer();
		//2.ָ����ʱ����
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