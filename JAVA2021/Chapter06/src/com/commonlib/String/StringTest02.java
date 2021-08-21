package com.commonlib.String;

// 字符串的拼接符+
public class StringTest02 {
    public static void main(String[] args) {
        // 字符串常量拼接编译器做了优化
        // 直接拼接 直接把"aaa" + "bbb"看成"aaabbb"
        String s = "aaa" + "bbb";   // 在栈中创建了一个引用类型对象s，在字符串常量池创建了一个字符串"aaabbb"

        String s1 = "xxx";
        String s2 = "yyy";
        // 间接拼接，会创建一个StringBuilder()对象，并调用append()方法将数据拼接，最后调用toString()方法返回拼接好的字符串
        String s3 = s1 + s2;    // new StringBuilder()).append(s1).append(s2).toString() // 在堆中创建了一个字符串对象"xxxyyy"

        // 因此在循环结构中，应避免字符串拼接。
        // 因为字符串一旦创建不可改变，只要频繁拼接，就会在堆中创建大量的字符串对象，给垃圾回收带来问题。
        // 应该手动在循环体外创建一个StringBuilder来进行字符串拼接
    }
}
