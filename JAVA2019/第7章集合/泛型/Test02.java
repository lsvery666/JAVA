/*
	泛型语法如何实现？
	泛型是一个编译阶段的语法
	在编译阶段统一集合中的类型
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		List<String> str=new ArrayList<String>();
		//str.add(1);错误
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