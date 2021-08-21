package com.Collection.Set;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：
    无序不可重复
    放到HashSet中的元素实际上是放到HashMap中的Key部分了
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("hello1");
        s.add("hello3");
        s.add("hello2");
        s.add("hello4");
        s.add("hello1");

        for(String str: s){
            System.out.println(str);
        }
    }
}
