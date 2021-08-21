/*
	深入remove方法
	1.迭代器的remove方法(推荐使用)
	2.集合自身带的remove方法
*/
import java.util.*;
public class Test05{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		Iterator it = c.iterator();
		while(it.hasNext()){
			Object element = it.next();
			it.remove();//通过迭代器删除
		}
		System.out.println(c.size());//0
		
		Collection d = new ArrayList();
		d.add(1);
		d.add(2);
		d.add(3);
		Iterator it2 = d.iterator();
		while(it2.hasNext()){
			Object element2 = it2.next();
			d.remove(element2);//通过集合自带的remove方法
		}
		System.out.println(d.size());
		/*第二种方法编译通过，运行异常
		当集合结构发生改变，迭代器没有重新获取时，调用next()方法会报下面异常
		Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        at Test05.main(Test05.java:26)
      */
	}
}