//���ﳵ
import java.util.*;
public class ShoppingCar{
	HashMap<Product,Integer> products=new HashMap<Product,Integer>();
	ShoppingCar(){}//����һ���յĹ��ﳵ
	//���һ����Ʒ
	public void add(Product p){
		products.put(p,1);
		System.out.println("ѡ���ɹ������ɼ���ѡ�����");
	}
	//���N����Ʒ
	public void add(Product p,Integer n){
		products.put(p,n);
		System.out.println("ѡ���ɹ������ɼ���ѡ�����");
	}
	//���ﳵ�Ƿ��������Ʒ
	public Product contains(String num) throws NoProductException{
		Set<Product> keys=products.keySet();
		Iterator<Product> it=keys.iterator();
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
				throw new NoProductException("���Ĺ��ﳵ��û�и���Ʒ��������ѡ�����");
			}
		}else{
			try{
				return null;
			}finally{
				throw new NoProductException("���Ĺ��ﳵ��û�и���Ʒ��������ѡ�����");
			}
		}
	}
	//ɾ��һ����Ʒ
	//ͨ�����ɾ��
	public void removeAll(String num) throws NoProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			products.remove(pro);
			System.out.println("ɾ���ɹ������ɼ���ѡ�����");
		}
	}
	//ɾ��һ����Ʒ
	public void removeOne(String num) throws NoProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			int m0=products.get(pro);
			if(m0==1){
				products.remove(pro);
				System.out.println("ɾ���ɹ������ɼ���ѡ�����");
			}else{
				products.put(pro,m0-1);
				System.out.println("ɾ���ɹ������ɼ���ѡ�����");
			}
		}
	}
	//ɾ��N����Ʒ
	public void removeN(String num,int n) throws NoProductException,LackOfProductException{
		Product pro=this.contains(num);
		if(pro!=null){
			int m0=products.get(pro);
			if(m0>=n){
				products.put(pro,m0-n);
				System.out.println("ɾ���ɹ������ɼ���ѡ�����");
			}else{
				throw new LackOfProductException("���Ĺ��ﳵ��ֻ��"+products.get(pro)+"��"+pro.name+"��������ѡ�����");
			}
		}
		
	}
	//��չ��ﳵ
	public void clear(){
		products.clear();
		System.out.println("���Ĺ��ﳵ�ѱ���գ����ɼ���ѡ�����");
	}
	//��ʾ������Ϣ
	public void printReceipt() throws NoProductException{
		Set<Product> keys=products.keySet();
		Iterator<Product> it=keys.iterator();
		if(it.hasNext()){
			double sum=0;
			System.out.println("���Ĺ��ﳵ����������Ʒ��");
			while(it.hasNext()){
				Product p=it.next();
				Integer v=products.get(p);
				sum=sum+v*p.price;
				System.out.println(p.num+"����Ʒ"+p.name+":"+v+"�� ��"+(v*p.price)+"Ԫ");
			}
			System.out.println("���Ĺ��ﳵ����Ʒ�ܼ�"+sum+"Ԫ��");
			System.out.println("������ѡ�����");
		}else{
			throw new NoProductException("���Ĺ��ﳵΪ�գ�������ѡ�����");
		}
		
	}
}