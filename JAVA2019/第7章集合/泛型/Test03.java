/*
	Map使用泛型
*/
import java.util.*;
public class Test03{
	public static void main(String[] args){
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("西瓜",10);
		m.put("苹果",20);
		m.put("香蕉",30);
		Set<String> keys=m.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String k=it.next();
			Integer v=m.get(k);
			System.out.println(k+"--->"+v);
		}
	}
}