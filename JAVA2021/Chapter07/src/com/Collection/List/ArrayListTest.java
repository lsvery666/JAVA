package com.Collection.List;

/*
class ArrayList :
    ArrayList集合底层是数组，数组是有下标的，所以ArrayList有很多数组的特性
    ArrayList集合底层默认初始化容量是10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10）
    扩大之后的容量是原容量的1.5倍
 */

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        System.out.println(l1.size());  // 0 获取的是元素的个数，不是容量

        ArrayList l2 = new ArrayList(20);

        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(0);

        // 构造方法可以接收一个Collection，将其转换为ArrayList
        ArrayList l3 = new ArrayList(hashSet);
        for (int i = 0; i < l3.size(); i++) {
            System.out.println(l3.get(i));  // 0 1 3
        }

    }
}

