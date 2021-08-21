package com.commonlib.String;

/*
String的两种创建方式
1. String a = "ABC";
    每当创建字符串常量时，JVM会首先检查字符串常量池，如果该字符串已经存在常量池中，那么就直接返回常量池中的实例引用。
    如果字符串不存在常量池中，就会实例化该字符串并且将其放到常量池中。
    由于String字符串的不可变性，常量池中一定不存在两个相同的字符串。
2. String b = new String("ABC")
    不管字符串常量池中是否有该字符串，new关键字一定会产生一个对象，并且这个对象存储在堆中。

intern方法
intern方法会从字符串常量池中查询当前字符串是否存在，如果存在，就直接返回当前字符串；如果不存在就会将当前字符串放入常量池中，之后再返回。
 */

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        s1 = "ab";
        System.out.println(s1); //ab

        String s2 = "hello";
        String s3 = "hello";
        System.out.println(s2==s3);//true


        String s4 = new String("hello");
        String s5 = new String("hello");
        System.out.println(s4 == s3);   // false
        System.out.println(s4 == s5);   // false
        System.out.println(s4.intern() == s5.intern());//true
    }
}
