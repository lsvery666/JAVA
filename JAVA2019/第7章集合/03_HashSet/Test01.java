/*
	Set���ϣ�HashSet
	1.HashSet�ײ�ʵ������һ��HashMap��HashMap�ײ�����˹�ϣ�����ݽṹ��
	2.��ϣ���ֽ�ɢ�б���ϣ��ײ���һ�����飬���������ÿһ��Ԫ����һ����������ÿһ������������һ����һ�޶���hashֵ������������±ꡣ
	��ĳ�����������е�ÿһ�������hashֵ����ȵġ�hasnֵʵ������key����hashCode��������ͨ��"hash function"ת���ɵ�ֵ��
	3.������ϣ�������Ԫ�أ�
		�ȵ��ñ��洢��key��hashCode����������ĳ���㷨�ó�hashֵ������������ϣ���в��������hashֵ����ֱ�Ӽ���Ԫ�أ������hashֵ�Ѿ����ڣ�
		��������key֮���equals���������equals����false���򽫸�Ԫ����ӡ����equals����true���������Ӹ�Ԫ�ء�
	4.HashSet��ʵ��HashMap�е�Key���֣�HashSet��ʲô�ص㣬HashMap�е�KeyӦ�þ�����ͬ���ص㡣
	5.HashSet��HashMao��ʼ����������16��Ĭ�ϼ���������0.75����������Ԫ�س�����ʼ������75%ʱ���������ݡ�
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		//����Set����
		Set s=new HashSet();
		s.add(1);
		s.add(1);
		s.add(100);
		s.add(85);
		s.add(88);
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}