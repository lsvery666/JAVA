//����ϵͳ
public class Restaurant{
	public static void main(String[] args){
		//1.�˿�
		Customer a=new Customer("����",5);
		//2.��ʦ
		Cook b=new Cook("����");
		//3.�˵� 
		Caidan c=a;//��̬
		//4.���
		String x=c.order(1);
		//5.����
		b.cook(x);
	}
}