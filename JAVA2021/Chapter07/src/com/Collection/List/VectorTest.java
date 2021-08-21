package com.Collection.List;

/*
Vector：
    1. 底层是一个数组
    2. 初始化容量：10
    3. 扩容之后是原容量的2倍
    4. Vector中所有的方法都是线程同步的，都带有synchronized关键字，是线程安全的。效率比较低，使用较少了。
    5. 怎么将非线程安全的ArrayList变成线程安全的呢？java.util.Collections
 */
import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        List v = new Vector();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);

        // 加到第11个时扩容
        v.add(11);

        Iterator it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List l = new ArrayList();
        // 变成线程安全的
        Collections.synchronizedList(l);

    }
}

