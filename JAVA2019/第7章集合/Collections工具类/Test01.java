/*
	���ڼ��Ϲ����� java.util.Collections;
	java.util.Collection;���Ͻӿ�
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		List l=new ArrayList();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(30);
		l.add(20);
		//����
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		for(Iterator it=l.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		//����
		Collections.sort(l);//Collections.sort()����ֻ�ܶ�List���Ͻ�������
		for(Iterator it2=l.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}
		//����Set����
		Set s=new HashSet();
		s.add(1);
		s.add(5);
		s.add(20);
		s.add(30);
		s.add(20);
		List lists=new ArrayList(s);
		Collections.sort(lists);
			for(int i=0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		
		
	}
}
