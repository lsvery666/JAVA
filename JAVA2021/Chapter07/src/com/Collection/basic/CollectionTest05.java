package com.Collection.basic;

/*
快速失败（fail-fast）
    java集合中的一种机制，在用迭代器遍历一个集合对象时，如果遍历过程中对集合对象的内容进行了修改（增加、删除、修改），则会抛出ConcurrentModificationException。
原理：
    迭代器在遍历时直接访问集合中的内容，并且在遍历过程中使用一个 modCount 变量。
    集合在被遍历期间如果内容发生变化，就会改变modCount的值。
    每当迭代器使用hashNext()/next()遍历下一个元素之前，都会检测modCount变量是否为expectedmodCount值，是的话就返回遍历；否则抛出异常，终止遍历。
    Tip：这里异常的抛出条件是检测到 modCount！=expectedmodCount 这个条件。如果集合发生变化时修改modCount值刚好又设置为了expectedmodCount值，则异常不会抛出。
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest05 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
    }
}
