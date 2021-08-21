package com.array.basic;
/*
	数组中存储元素的类型是统一的，每一个元素在内存中所占的空间大小是一致的，
	知道数组的首元素内存地址，要查找的元素只要知道下标就可以快速的计算出偏移量
	通过首元素内存地址加上偏移量快速计算出要查找元素的内存地址，通过内存地址快速
	定位该元素，所以数组查找元素的效率较高。

	随机的对数组进行增删元素，当增加元素的时候，为了保证数组中元素在空间存储上是有序的，所以被添加元素位置后面的所有元素都要向后移动。
	删除元素时，后面所有的元素都要向前移动，所以数组的增删元素的效率很低。

	初始化一维数组有两种方式：
		1.静态初始化
		2.动态初始化
*/
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 2, 1, 0};
        for (int i : a) {
            System.out.println(i);
        }

        System.out.println("=============");

        quickSort(a, 0, a.length-1);

        for (int i : a) {
            System.out.println(i);
        }
    }

    // 快速排序
    public static void quickSort(int[] a, int start, int end){

        if(start >= end){
            return;
        }
        int pivot = a[start];
        int left = start;
        int right = end;

        while(left<right){
            while(left<right && a[right]>=pivot){
                right--;
            }
            a[left] = a[right];
            while(left<right && a[left]<=pivot){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = pivot;
        quickSort(a, start, left-1);
        quickSort(a, left+1, end);
    }
}

