package com.oop.params;

/**
 * 值传递（pass by value）是指在调用函数时将实际参数复制一份传递到函数中，这样在函数中如果对参数进行修改，将不会影响到实际参数。
 *
 * 引用传递（pass by reference）是指在调用函数时将实际参数的地址直接传递到函数中，那么在函数中对参数所进行的修改，将影响到实际参数。
 *
 * java是值传递，当参数类型时基本类型时，将这个数据类型复制了一份，
 * 当参数类型是引用类型时，把实参对象引用的地址当做值传递给了形式参数。
 */

// 基本数据类型
public class _01_PassParams {
    public static void m1(int i){
        i++;
        System.out.println("m1--->"+i);//11
    }
    public static void main(String[] args){
        int i = 10;
        m1(i);
        System.out.println("main--->"+i); // 10 两个i所在内存不同
    }
}
