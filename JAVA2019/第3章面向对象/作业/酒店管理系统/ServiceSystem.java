import java.util.Scanner;
public class ServiceSystem{
	public static void main(String[] args){
		Hotel a=new Hotel("è����");//������è�����Ƶꡱ
		a.initialize();//��ʼ���Ƶ�
		printmenu(a);//�ṩ����˵�
		boolean open=true;
		while(open){
			Scanner s=new Scanner(System.in);
			Integer choice = Integer.parseInt(s.next());
			switch(choice){
				case 1:
					System.out.println("==================");
					a.show();
					System.out.println("==================");
					System.out.println("������ѡ�����");
					break;
				case 2:
					System.out.println("==================");
					System.out.println("��������ҪԤ���ķ�����룺��101~510��");
					Scanner x=new Scanner(System.in);
					Integer no = Integer.parseInt(x.next());
					a.order(no);
					System.out.println("==================");
					System.out.println("������ѡ�����");
					break;
				case 3:
					System.out.println("==================");
					System.out.println("��������Ҫ�˶��ķ�����룺��101~510��");
					Scanner y=new Scanner(System.in);
					Integer no2 = Integer.parseInt(y.next());
					a.unsubscribe(no2);
					System.out.println("==================");
					System.out.println("������ѡ�����");
					break;
				case 4:
					System.out.println("==================");
					System.out.println("лл�ݹˣ�");
					open=false;
					break;
				default:
					System.out.println("�������ִ�������������1~4��");
					break;
			}
		}
	}
	public static void printmenu(Hotel a){
		System.out.println("��ӭ����"+a.name+"�Ƶ�!");
		System.out.println("����ѡ�����·���");
		System.out.println("==================");
		System.out.println("1.�鿴����");
		System.out.println("2.Ԥ������");
		System.out.println("3.�˶�����");
		System.out.println("4.�˳�ϵͳ");
	}
}