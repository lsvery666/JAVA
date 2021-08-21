package com.commonlib.String;

/*
String类的常用构造方法
String(字符串常量)
String(byte[] bytes[, int offset, int length])
String(char[] chars[, int offset, int length])
 */

public class StringTest05 {
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99};
        String s1 = new String(bytes);
        System.out.println(s1); // abc

        String s2 = new String(bytes, 1, 2);
        System.out.println(s2); // bc

        char[] chars = {'中', '国', '人'};
        String s3 = new String(chars);
        System.out.println(s3);
    }
}
