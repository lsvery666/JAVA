package com.Collection.basic;

/*
	Iterator iterator();
	获取集合所依赖的迭代器对象
	注意：这种方式是所有集合通用的遍历方式
	Iterator初始指向-1位置，也就是调用it.next()一次之后，iterator才会指向第0个元素
*/
import java.util.*;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new LinkedList();
        c.add(100);         //自动装箱
        c.add(3.14);        //自动装箱
        c.add(false);       //自动装箱

        //获得迭代器
        //不需要关心底层集合的具体类型，所有集合依赖的迭代器（类）都实现了java.util.Iterator接口
        Iterator it = c.iterator();    //迭代器是面向接口编程
        //it是一个引用，保存了内存地址，指向堆中的“迭代器对象”
        System.out.println(it);//java.util.LinkedList$ListItr@47089e5f
        //说明这里it指向了一个java.util.LinkedList$ListItr类型的对象，ListItr这个类实现了Iterator接口

        //while循环遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }

		/*
			boolean b=it.hasNext();判断是否有更多的元素，如果有返回true
			Object o=it.next();将迭代器向下移动一位，并且取出指向的元素

			原则：调用it.next()方法之前必须调用it.hasNext(),防止出现空指针异常
		*/
		/*for循环遍历
		for(;it.hasNext();){

			System.out.println(it.next());
		}
		*/
    }
}

