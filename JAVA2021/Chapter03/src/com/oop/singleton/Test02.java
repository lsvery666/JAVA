package com.oop.singleton;

public class Test02 {
    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        System.out.println(s1 == s2);
    }
}
