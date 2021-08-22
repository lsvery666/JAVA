package com.commonlib.Integer;

public class Test07 {
    public static void main(String[] args) {
        // “129”保存在栈中的局部变量表中
        int a = 129;

        // "129"保存在常量池中
        final int b = 129;

        // "100"保存在常量池中
        Integer c1 = 100;
        Integer c2 = 100;

        // "129"保存在堆中，是两个不同的实例
        Integer d1 = 129;
        Integer d2 = 129;

        // 基本类型比较的是值
        System.out.println(a == d1);
        System.out.println(a == d2);

        // 引用类型比较的是地址
        System.out.println(c1 == c2);
        System.out.println(d1 == d2);
    }
}
