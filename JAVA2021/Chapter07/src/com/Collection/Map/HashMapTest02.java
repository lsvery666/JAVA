package com.Collection.Map;

import java.util.HashSet;
import java.util.Set;

/*
equals方法如果返回结果是true，hashCode方法应该返回相同的值
hashCode()方法和equals()方法不用研究了，直接使用IDEA工具生成，但是这两个方法需要同时生成
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("Tom");
        Student s2 = new Student("Tom");

        // 重写equals方法之前是false
        System.out.println(s1.equals(s2));

        // 重写hashCode()方法之前分别是： 2129789493 1313922862
        System.out.println("s1.hashCode() = " + s1.hashCode()); // 重写之后：84305
        System.out.println("s2 hashCode() = " + s2.hashCode()); // 重写之后：84305

        Set<Student> s = new HashSet<>();
        s.add(s1);
        s.add(s2);
        System.out.println(s.size());
    }
}
