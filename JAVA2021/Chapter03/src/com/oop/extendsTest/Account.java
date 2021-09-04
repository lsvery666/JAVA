package com.oop.extendsTest;

public class Account {
    private int num;
    private String name;
    static String className = "Account";

    Account(){
        System.out.println("Account的无参构造方法执行");
    }

    Account(int num, String name){
        System.out.println("Account的有参构造方法执行");
        this.num = num;
        this.name = name;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Account {num:"+num+", name:"+name+"}");
    }

    public void m1(){
        System.out.println("Account的非静态方法m1()执行");
    }

    public static void m2(){
        System.out.println("Account的静态方法m2()执行");
    }
}
