/*
	������ǿforѭ��
	�﷨��
	for(���� ����:������/������){}
	����Ҫ��ʹ����ǿforѭ��������ʹ�÷���
	���������ʹ�÷��ͣ���ѭ����Ӧ����Object���ͱ�ʾ�����е�Ԫ��
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//foreach
		for(int j:a){
			System.out.println(j);//int j������Ǽ��ϻ��������е�ÿһ��Ԫ��
		}
		//����
		Set<String> str=new HashSet<String>();
		str.add("����");
		str.add("����");
		str.add("����");
		str.add("����");
		for(String name:str){
			System.out.println(name);
		}
		//���ϲ�ʹ�÷���
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		for(Object e:l){
			System.out.println(e);
		}
	}
}