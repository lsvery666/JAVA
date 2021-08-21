package com.array.basic;

/*
	动态初始化一维数组，会先在堆内存中分配这个数组，并且数组中每一个元素都采用默认值
	println(a) a为引用，若a为空指针，直接输出null，若a不为空指针，则输出a.toString
	而如果采用println(a.toString()) a为引用，若a为空指针，会在运行时发生空指针异常
*/

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for(int i: a){
            System.out.println(i);
        }

        // 第一种初始化方式：遍历赋值
        a[0] = 21;
        a[1] = 22;
        a[2] = 23;
        a[3] = 24;
        a[4] = 25;

        for(int i:a){
            System.out.println(i);
        }

        // 第二种初始化方式
        int[] b = new int[]{21, 22, 23, 24, 25};
        for(int i: b){
            System.out.println(i);
        }

    }
}
