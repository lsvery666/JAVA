/*
	this�ؼ��ֿ������ڹ��췽���У�ͨ��һ�����췽����������һ�����췽��
	��this���ù��캯�������붨���ڹ��캯���ĵ�һ�С���Ϊ���캯�������ڳ�ʼ���ģ����Գ�ʼ������һ��Ҫִ�С��������ʧ�ܡ�
*/
public class ThisTest4{
	public static void main(String[] args){
		Mydate t1 = new Mydate();
		System.out.println(t1.year+"��"+t1.month+"��"+t1.date+"��");
		
	}
}

class Mydate{
	//��Ա����
	int year;
	int month;
	int date;

	//���췽��
	//�����ڴ�������ʱ��Ĭ�ϵ�������1997-1-1
	Mydate(){
		/*
			year=1997;
			month=1;
			date=1;
		*/
		// System.out.println("�޲ι��췽��ִ��");	// ����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
		this(1997,1,1);
	}

	Mydate(int _year,int _month,int _date){
		year = _year;
		month = _month;
		date = _date;
	}
}