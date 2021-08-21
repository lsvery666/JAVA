package com.array.basic;
// 数组作为函数的参数

public class ArrayTest04 {
    public static void main(String[] args) {
        // 第一种方式
        int[] a = {1, 2, 3};
        m1(a);

        // 第二种方式
        m1(new int[]{1, 2, 3});

        // 非法的表达式开始
        // m1({1, 2, 3});
    }
    public static void m1(int[] nums){
        for(int num: nums){
            System.out.println(num);
        }
    }
}
