//�˿�
public class Customer implements Caidan{
	//����
	String name;
	//��λ��
	int seatnum;
	//���췽��
	Customer(String name,int seatnum){
		this.name=name;
		this.seatnum=seatnum;
	}
	//��� 1--�������� 2--������˿
	public String order(int x){
		if(x==1){
			System.out.println(seatnum+"��λ�˿�"+name+"����"+a+"��");
			return a; 
		}else if(x==2){
			System.out.println(seatnum+"��λ�˿�"+name+"����"+b+"��");
			return b;
		}else{
			System.out.println("û�������");
			return null;
		}
	}
}