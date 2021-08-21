package com.Collection.Set;

import java.util.TreeSet;

/*
TreeSet集合底层实际上是一个TreeMap
TreeMap集合底层实际上是一个二叉树
放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了
TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序，称为可排序集合(SortedSet)
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("zhangsi");

        for(String s: treeSet){
            // 按照字典顺序，升序！
            System.out.println(s);
        }

        System.out.println("==========");

        TreeSet<Integer> treeSet2 = new TreeSet<>();

        treeSet2.add(100);
        treeSet2.add(10);
        treeSet2.add(2200);
        treeSet2.add(-10);

        for(Integer i: treeSet2){
            // 升序
            System.out.println(i);
        }
    }
}
