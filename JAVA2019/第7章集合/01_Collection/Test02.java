/*
	Iterator iterator();
	��ȡ�����������ĵ���������
	ע�⣺���ַ�ʽ�����м���ͨ�õı�����ʽ
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		Collection c = new LinkedList();
		c.add(100);		//�Զ�װ��
		c.add(3.14);	//�Զ�װ��
		c.add(false);	//�Զ�װ��
		//��õ�����
		//����Ҫ���ĵײ㼯�ϵľ������ͣ����м��������ĵ��������ࣩ��ʵ����java.util.Iterator�ӿ�
		Iterator it = c.iterator();	//������������ӿڱ��
									//it��һ�����ã��������ڴ��ַ��ָ����еġ�����������
		System.out.println(it);//java.util.LinkedList$ListItr@47089e5f
		                       //˵������itָ����һ��java.util.LinkedList$ListItr���͵Ķ���ListItr�����ʵ����Iterator�ӿ�
		//whileѭ������
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
			boolean b=it.hasNext();�ж��Ƿ��и����Ԫ�أ�����з���true
			Object o=it.next();�������������ƶ�һλ������ȡ��ָ���Ԫ��
			
			ԭ�򣺵���it.next()����֮ǰ�������it.hasNext(),��ֹ���ֿ�ָ���쳣
		*/
		/*forѭ������
		for(;it.hasNext();){
			
			System.out.println(it.next());
		}
		*/
	}
}