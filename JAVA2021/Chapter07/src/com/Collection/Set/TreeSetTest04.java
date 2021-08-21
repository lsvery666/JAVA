package com.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
第二种实现自定义数据类型比较的方式
定义一个类实现java.util.Comparator，重写里面的compare方法
创建一个Comparator对象，传入TreeSet的构造方法里

Comparable和Comparator怎么选择呢？
    当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议实现Comparable接口
    如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        // 匿名内部类
        TreeSet<Person> m = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        m.add(new Person(22, "Curry"));
        m.add(new Person(44, "James"));
        m.add(new Person(22, "Harden"));
        m.add(new Person(33, "Durant"));

        for(Person p: m){
            System.out.println(p);
        }
    }
}
