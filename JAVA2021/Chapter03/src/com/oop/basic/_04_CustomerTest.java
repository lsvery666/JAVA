package com.oop.basic;

public class _04_CustomerTest{
    public static void main(String[] args){
        _03_Customer c = new _03_Customer();
        c.setAge(-10);
        System.out.println(c.getAge()); // 默认值
    }
}