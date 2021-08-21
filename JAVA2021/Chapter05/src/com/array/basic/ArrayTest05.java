package com.array.basic;

/*
多维数组
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 4}};
        for(int[] rows: a){
            for(int num: rows) {
                System.out.println(num);
            }
        }
    }
}
