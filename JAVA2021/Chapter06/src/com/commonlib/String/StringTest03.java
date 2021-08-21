package com.commonlib.String;

public class StringTest03 {
    public static void main(String[] args) {
        //以下程序执行结束之后，会在字符串缓冲区创建三个字符串对象"aaa"、"bbb"、"aaabbb"，堆中创建一个字符串对象"aaabbb"
        String s1 = "aaa";				// 常量池中
        String s2 = "bbb";				// 常量池中
        String s3 = s1 + s2;			// 堆中
        String s4 = "aaabbb";			// 常量池中
        String s5 = "aaa" + "bbb";		// 常量池中 等价于String s5 = "aaabbb";
        System.out.println(s3 == s4);	// false
        System.out.println(s3.intern() == s4);	// true
        System.out.println(s4 == s5);	// true
    }
}
