package com.Collection.basic;

/*
集合和数组的区别：
1：数组是固定长度的；集合可变长度的。
2：数组可以存储基本数据类型，也可以存储引用数据类型；集合只能存储引用数据类型。
3：数组存储的元素必须是同一个数据类型；集合存储的对象可以是不同数据类型。
4：数组int[] a = {1, 2, 3}，a是栈中的变量，指向堆中的数组对象{1, 2, 3}。
5：集合Collections c = new ArrayList()，c是栈中的变量，指向堆中的ArrayList，而ArrayList里面存放的是指向元素的引用，而不是元素本身。
 */

import java.util.ArrayList;
import java.util.Collection;
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        int a = 1;
        // 自动装箱
        c.add(1);
        for(Object o: c){
            System.out.println(o);
        }
    }
}
