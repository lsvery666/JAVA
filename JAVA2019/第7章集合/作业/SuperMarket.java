//����
import java.util.*;
public class SuperMarket{
	//������
	String name;
	//��Ʒ
	TreeSet<Product> products=new TreeSet<Product>();//����Ʒ�������
	SuperMarket(String name){
		this.name=name;
	}
	//�����Ʒ
	public void addProduct(Product p){
		products.add(p);
	}
	//չʾ��Ʒ��Ϣ
	public void showProduct() throws NoProductException{
		Iterator<Product> it=products.iterator();
		if(it.hasNext()){
			System.out.println("����������ѡ��������Ʒ��");
			while(it.hasNext()){
				Product p=it.next();
				System.out.println(p.num+"����Ʒ "+p.name+"�۸�"+p.price+"Ԫ/��");
			}
			System.out.println("==================");
		}else{
			throw new NoProductException("û����Ʒ�ɹ�ѡ����������ѡ�����");
		}
	}
	//�����Ƿ��и���Ʒ
	public Product contains(String num) throws NoProductException{
		Iterator<Product> it=products.iterator();
		if(it.hasNext()){
			while(it.hasNext()){
				Product p=it.next();
				if((p.num).equals(num)){
					return p;
				}
		   }
		   try{
		   	return null;
		   }finally{
		   	throw new NoProductException("������û�и���Ʒ��������ѡ�����");
		   }
		   
		}else{
			try{
				return null;
			}finally{
				throw new NoProductException("������û�и���Ʒ��������ѡ�����");
			}
			
		}
	}
	
	//��ʾ��Ϣ
	public void printmenu(){
		System.out.println("��ӭ����"+this.name+"����!");
		System.out.println("����ѡ�����·���");
		System.out.println("==================");
		System.out.println("1.ѡ����Ʒ");
		System.out.println("2.ɾ����Ʒ");
		System.out.println("3.�鿴���ﳵ");
		System.out.println("4.��չ��ﳵ");
		System.out.println("5.�˳�ϵͳ");
	}
}