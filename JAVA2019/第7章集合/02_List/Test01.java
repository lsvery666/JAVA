/*
	List���ϴ洢Ԫ���ص㣺
		1.����
		2.���ظ�
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		List l=new ArrayList();//��̬
		l.add(10);
		l.add(1);
		l.add(99);
		l.add(100);
		l.add(250);
		l.add(250);
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
