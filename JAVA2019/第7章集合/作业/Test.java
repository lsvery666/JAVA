//���Գ���
import java.util.*;
public class Test{
	public static void main(String[] args){
		//��������
		SuperMarket sm=new SuperMarket("�˻�");
		//������Ʒ
		Product apple=new Product("003","ƻ��",2.0);
		Product apple2=new Product("003","ƻ��",2.0);
		Product banana=new Product("002","�㽶",3.0);
		Product peach=new Product("001","����",4.0);
		//���������Ʒ
		sm.addProduct(apple);
		sm.addProduct(apple2);
		sm.addProduct(banana);
		sm.addProduct(peach);
		//�������ﳵ
		ShoppingCar sc=new ShoppingCar();
		//��ʾ��Ϣ
		sm.printmenu();
		boolean open=true;
		while(open){
			Scanner s=new Scanner(System.in);
			Integer choice = Integer.parseInt(s.next());
			switch(choice){
				case 1://ѡ����Ʒ
					System.out.println("==================");
					try{
						sm.showProduct();
					}catch(NoProductException xx){
						System.out.println(xx.getMessage());
					}
					Scanner x1=new Scanner(System.in);
					try{
						Product pp=sm.contains(x1.next());
						System.out.println("������ѡ��������");
						Scanner x2=new Scanner(System.in);
						Integer no=Integer.parseInt(x2.next());
						if(no==1){
							sc.add(pp);//���һ����Ʒ
						}else if(no>1){
							sc.add(pp,no);//���n����Ʒ
						}else{
							System.out.println("������һ��������");
						}
					}catch(NoProductException x){
						System.out.println(x.getMessage());
					}
					break;
				case 2://ɾ�����ﳵ��Ʒ
					System.out.println("==================");
					System.out.println("������Ҫɾ������Ʒ��ţ�");
					Scanner y1=new Scanner(System.in);
					String num=y1.next();
					try{
						Product py=sc.contains(num);
						System.out.println("������ɾ������(-1��ʾȫ��ɾ��)��");
						Scanner y2=new Scanner(System.in);
						Integer noy=Integer.parseInt(y2.next());
						if(noy==1){
							sc.removeOne(num);//ɾ��һ����Ʒ
						}else if(noy>=0){
							sc.removeN(num,noy);//ɾ��n����Ʒ
						}else if(noy==-1){
							sc.removeAll(num);//ɾ��������Ʒ
						}else{
							System.out.println("��������ڵ���-1��������");
						}		
					}catch(NoProductException y){
						System.out.println(y.getMessage());
					}catch(LackOfProductException yy){
						System.out.println(yy.getMessage());
					}
					break;
				case 3://��ʾ���ﳵ��Ϣ
					System.out.println("==================");
					try{
						sc.printReceipt();
					}catch(NoProductException z){
						System.out.println(z.getMessage());
					}
					break;
				case 4://��չ��ﳵ
					System.out.println("==================");
					sc.clear();
					break;
				case 5:
					System.out.println("==================");
					System.out.println("лл�ݹˣ�");
					open=false;
					break;
				default:
					System.out.println("�������ִ�������������1~5��");
					break;
			}
		}
		
	}
	
	
}