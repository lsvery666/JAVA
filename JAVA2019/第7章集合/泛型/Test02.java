/*
	�����﷨���ʵ�֣�
	������һ������׶ε��﷨
	�ڱ���׶�ͳһ�����е�����
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		List<String> str=new ArrayList<String>();
		//str.add(1);����
		str.add("JACK");
		str.add("SUN");
		str.add("TIM");
		str.add("BOB");
		Iterator<String> it=str.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
			
		}
	}
}