package com.Collection.Collections;
/*
1. Collections.synchronizedList()
2. Collections.sort(list)
 */
import java.util.*;

public class CollectionsTest01 {
    public static void main(String[] args) {
        // ArrayList集合不是线程安全的
        ArrayList arrayList = new ArrayList();

        // 变成线程安全的
        Collections.synchronizedList(arrayList);

        // 排序
        arrayList.add("abf");
        arrayList.add("abd");
        arrayList.add("abc");

        Collections.sort(arrayList);
        for(Object o: arrayList){
            System.out.println(o);
        }

        // 对Set集合怎么排序呢
        // Collections.sort只能接收list对象
        Set<String> s = new HashSet<>();
        s.add("king1");
        s.add("kinga");
        s.add("king0");

        List<String> l = new ArrayList<>(s);
        Collections.sort(l);
        for(String str: l){
            System.out.println(str);
        }
    }
}
