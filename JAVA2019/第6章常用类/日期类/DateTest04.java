/*
	Date d=new Date();  ��ȡϵͳ��ǰʱ��
	Date d=new Date(long millis);��1970��1��1�տ�ʼ�ĺ�����
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest04{
	public static void main(String[] args){
		Date t1=new Date(1000);
		//��Dateת��ΪString
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		
		//������
		System.out.println(sdf.format(t1));//1970,01,01 08:00:01 000
		
		//��ȡ��ǰϵͳʱ���ǰʮ����ʱ��
		Date t2=new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(sdf.format(t2));//2018,11,19 20:05:39 030

	}
}