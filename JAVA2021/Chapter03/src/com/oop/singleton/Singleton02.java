package com.oop.singleton;

// 饿汉式
public class Singleton02 {
    private static final Singleton02 s = new Singleton02();

    private Singleton02(){}

    public static Singleton02 getInstance(){
        return s;
    }
}
