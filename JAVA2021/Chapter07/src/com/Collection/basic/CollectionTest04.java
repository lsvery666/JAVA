package com.Collection.basic;

/*
	remove方法
	1.Collection中的remove
	2.iterator中的remove
*/

import java.util.*;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(c.size());//0

        Collection d = new ArrayList();
        d.add(1);
        d.add(2);
        d.add(3);
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            Object element2 = it2.next();
            d.remove(element2);
        }
        System.out.println(d.size());
		/*
		当集合的存储结构发生变化时，仍采用之前的迭代器就会产生如下异常：并发修改异常
		Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForCommodification(Unknown Source)
        at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        at Test05.main(Test05.java:26)
      */
    }
}
