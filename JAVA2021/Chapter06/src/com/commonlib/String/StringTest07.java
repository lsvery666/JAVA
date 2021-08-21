package com.commonlib.String;

/*
private final byte[] value;
private和final保证了字符串对象是不可变的
为什么要设计成不可变的？
1. 字符串常量池的需要。当两个字符串常量相同时，指向同一个对象，可以节省内存。如果设计成可变的，改变一个字符串，所有指向它的引用都会被影响。
2. 允许String对象缓存HashCode。 字符串不变性保证了HashCode的唯一性，因此可以放心地进行缓存，不必每次都去计算hash值。
3. 安全性。 因为字符串是不变的，因此可以共享，不用担心被破坏，换言之它是只读的，因此是线程安全的。
 */

public class StringTest07 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        a = "xyz";
        System.out.println(b);
    }
}
