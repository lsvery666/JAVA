package com.array.basic;
/*
	数组：
		1.数组是一种引用类型
		2.数组是一种简单的数据结构，线性的结构。
		3.数组是一个容器，可以用来存储其他元素。
		4.数组是可以存储任意数据类型的元素。
		5.数组中存储的元素类型是统一的。
		6.数组长度不可改变，数组一旦创建长度是不可改变的，固定的。
		7.数组以首元素的内存地址作为数组对象的内存地址。
		8.数组中每一个元素都是有下标的，有索引的，从0开始。
		9.任何一个数组都有一个length属性用来获取数组中元素的个数。
		10.数组通过元素的下标取得元素，语法：<数组名>[下标]。
		11.数组优点：查找效率高 缺点：增删元素效率低。
		12.对于基本数据类型，数组中存放的是数据本身，对于引用类型，数组中存放的是引用。
	数组分为:
		一维数组
		二维数组
		三维数组
		多维数组
*/

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a = {100, 200, 300};

        boolean[] b = {true, true, false};

        String[] str = {"AB", "BC", "EF"};

        char[] ch = {'a', 97, 'c'};

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objs = {o1, o2, o3};
    }
}
