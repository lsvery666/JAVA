/*
	关于Map集合中常用的方法
	存储在Map集合key部分的元素需要同时重写HashCode+equals方法
*/
import java.util.*;
public class Test01{
	public static void main(String[] args){
		//创建集合
		Map m=new HashMap();//HashMap的默认初始化容量是16，默认加载因子是0.75
		//存储键值对
		m.put("10000","JACK");
		m.put("10001","JAY");
		m.put("10002","TIM");
		m.put("10003","JOHN");
		m.put("10000","HHH");
		//键值对个数
		System.out.println(m.size());//4
		//判断是否包含这样的key
		System.out.println(m.containsKey("10000"));//true
		//判断是否包含这样的value
		//注意：Map中如果Key重复了，则value进行覆盖
		System.out.println(m.containsValue("HHH"));//true
		//通过key来获取value
		Object v=m.get("10000");
		System.out.println(v);//HHH
		//通过Key来删除键值对
		m.remove("10002");
		System.out.println(m.size());//3
		//获取集合中所有的Value
		Collection vs=m.values();
		Iterator it=vs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}//HHH JAY JOHN
		//获取集合中所有的key
		//遍历Map
		Set keys=m.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()){
			Object k=it2.next();
			Object vk=m.get(k);
			System.out.println(k+"--->"+vk);
		}
		//entrySet()
		//将Map转换成Set集合
		Set e=m.entrySet();
		Iterator it3=e.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
	}
}

