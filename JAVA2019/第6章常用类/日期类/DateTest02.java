/*
	��ȡϵͳ��ǰʱ��
*/
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTest02{
	public static void main(String[] args){
		//��ȡϵͳ��ǰʱ��
		Date nowTime = new Date();
		System.out.println(nowTime);//Mon Nov 19 18:35:25 CST 2018
		//���ϳ���˵��java.util.Date�Ѿ���д��Object�е�toString����
		//ֻ������д�Ľ�������й��˽���̫���
		//�������롰��ʽ�����ڡ�
		//java.util.Date-->String
		
		/*
			���ڸ�ʽ
			y ��
			M ��
			d ��
			H Сʱ
			m ��
			s ��
			S ��
		*/
		//�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm:ss SSS");
		//��ʼ��ʽ��(Date-->String)
		String strTime = sdf.format(nowTime);
		System.out.println(strTime);

		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date()));
	}
}