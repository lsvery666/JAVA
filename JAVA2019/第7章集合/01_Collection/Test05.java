/*
	����remove����
	1.��������remove����(�Ƽ�ʹ��)
	2.�����������remove����
*/
import java.util.*;
public class Test05{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		Iterator it = c.iterator();
		while(it.hasNext()){
			Object element = it.next();
			it.remove();//ͨ��������ɾ��
		}
		System.out.println(c.size());//0
		
		Collection d = new ArrayList();
		d.add(1);
		d.add(2);
		d.add(3);
		Iterator it2 = d.iterator();
		while(it2.hasNext()){
			Object element2 = it2.next();
			d.remove(element2);//ͨ�������Դ���remove����
		}
		System.out.println(d.size());
		/*�ڶ��ַ�������ͨ���������쳣
		�����Ͻṹ�����ı䣬������û�����»�ȡʱ������next()�����ᱨ�����쳣
		Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        at Test05.main(Test05.java:26)
      */
	}
}