package com.commonlib.Integer;

public class Test08 {
    public static void main(String[] args) {
        // 一开始常量池容量池计数值 20
        int a = 100;        // 22
        final int b = 100;  // 23
        Integer c = 100;    // 31
        Integer d = 129;    // 32
    }
}
