/*
	����Map�����г��õķ���
	�洢��Map����key���ֵ�Ԫ����Ҫͬʱ��дHashCode+equals����
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		//��������
		Map m=new HashMap();//HashMap��Ĭ�ϳ�ʼ��������16��Ĭ�ϼ���������0.75
		//�洢��ֵ��
		m.put("10000","JACK");
		m.put("10001","JAY");
		m.put("10002","TIM");
		m.put("10003","JOHN");
		m.put("10000","HHH");
		//��ֵ�Ը���
		System.out.println(m.size());//4
		//�ж��Ƿ����������key
		System.out.println(m.containsKey("10000"));//true
		//�ж��Ƿ����������value
		//ע�⣺Map�����Key�ظ��ˣ���value���и���
		System.out.println(m.containsValue("HHH"));//true
		//ͨ��key����ȡvalue
		Object v=m.get("10000");
		System.out.println(v);//HHH
		//ͨ��Key��ɾ����ֵ��
		m.remove("10002");
		System.out.println(m.size());//3
		//��ȡ���������е�Value
		Collection vs=m.values();
		Iterator it=vs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}//HHH JAY JOHN
		//��ȡ���������е�key
		//����Map
		Set keys=m.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()){
			Object k=it2.next();
			Object vk=m.get(k);
			System.out.println(k+"--->"+vk);
		}
		//entrySet()
		//��Mapת����Set����
		Set e=m.entrySet();
		Iterator it3=e.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}

