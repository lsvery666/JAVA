/*
	this�ؼ���
*/
public class ThisTest1{
	public static void main(String[] args){
		Mydate t1=new Mydate(2018,11,10);
		System.out.println(t1.year+"��"+t1.month+"��"+t1.date+"��");
		
	}
}
class Mydate{
	//��Ա����
	int year;
	int month;
	int date;
	//���췽��
	Mydate(){}

    Mydate(int _year,int _month,int _date){
		year=_year;
		month=_month;
		date=_date;
	}
}