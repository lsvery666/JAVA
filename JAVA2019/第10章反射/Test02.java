/*
	��ȡClass���Ͷ�������ַ�ʽ
*/
import java.util.Date;
public class Test02
{
	public static void main(String[] args) throws Exception{
		//��һ�ַ�ʽ
		//static Class forName(Strng classname){}
		Class c1=Class.forName("Employee");
		//c1���ñ����ڴ��ַָ����еĶ��󣬸ö���������Employee������
		
		//�ڶ��ַ�ʽ
		//java��ÿ�����Ͷ���class����
		Class c2=Employee.class;

		//�����ַ�ʽ��
		//public Class getClass(){}
		//�κ�һ��java������getClass����
		Employee e=new Employee();
		Class c3=e.getClass();
		//c3���������ࣨe������ʱ����Employee)

		//��ΪEmployee�������JVM��ֻ��һ��������c1,c2,c3���ڴ��ַ����ͬ�ģ�ָ�����Ψһ��һ������
		System.out.println(c1==c2);//true
		System.out.println(c2==c3);//true

		Class c4=Date.class;//c4����Date�����
		Class c5=Class.forName("java.util.Date");//����д��ȫ��
		Date d=new Date();
		Class c6=d.getClass();

		//c7����int����
		Class c7=int.class;


	}
}