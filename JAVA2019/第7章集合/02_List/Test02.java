/*
	����List����
	ArrayList���ϵײ������飬���������±��
	����ArrayList�кܶ����������
	
	ArrayList���ϵײ�Ĭ�ϳ�ʼ��������10������֮���������ԭ������1.5��
	Vector���ϵײ�Ĭ�ϳ�ʼ��������10������֮���������ԭ������2��
	
	����Ż�ArrayList��Vector?
		�����������ݲ�������Ϊ������Ҫ���鿽�������鿽���ܺ��ڴ档
		һ���Ƽ��ڴ������ϵ�ʱ��ָ����ʼ������
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		List l=new LinkedList();
		l.add(123);
		l.add(321);
		l.add(555);
		l.add(69);
		
		l.add(1,555);
		
		//System.out.println(l.get(0));
		
		//����List(List�������еı�����ʽ)
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
	}
}