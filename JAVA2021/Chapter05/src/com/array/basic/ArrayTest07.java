package com.array.basic;

/*
4. 转换
    List l = Arrays.asList(a)
1）Arrays.asList()方法返回的对象是Arrays的内部类，对list的操作仍然反映在原数组上，因此这个list是定长的，不支持add、remove操作；
2）由于asList方法接受的泛型参数，因此不能用于基本类型
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest07 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 3, 4};
        List<Integer> list = Arrays.asList(nums);
        for(Integer i: list){
            System.out.println(i);
        }

         list.add(5);    // 编译可以通过，运行报错 java.lang.UnsupportedOperationException

        // 对于基本类型，只能一个一个添加
        List<Integer> a = new ArrayList<>();
        int[] nums2 = {1, 2, 4, 5};
        for(int i: nums2){
            a.add(i);
        }
    }
}
