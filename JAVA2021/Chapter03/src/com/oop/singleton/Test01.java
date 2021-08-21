package com.oop.singleton;

public class Test01 {
    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }
}
