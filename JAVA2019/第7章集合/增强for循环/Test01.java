/*
	关于增强for循环
	语法：
	for(类型 变量:数组名/集合名){}
	集合要想使用增强for循环，尽量使用泛型
	集合如果不使用泛型，在循环中应该用Object类型表示集合中的元素
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
			System.out.println(j);//int j代表的是集合或者数组中的每一个元素
		}
		//集合
		Set<String> str=new HashSet<String>();
		str.add("张三");
		str.add("李四");
		str.add("王五");
		str.add("赵六");
		for(String name:str){
			System.out.println(name);
		}
		//集合不使用泛型
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