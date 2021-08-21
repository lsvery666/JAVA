package com.oop.extendsTest;

/*
方法重写的条件：
（1）两个类必须有继承关系，这是前提条件；
（2）重写之后的方法和之前的方法具有相同的返回值类型，相同的方法名，相同的形式参数列表；
（3）重写方法的访问权限不能比之前方法的权限更低，可以更高；
（4）重写方法的抛出异常数不能比之前方法的抛出异常数更多，可以更少。
 */

public class Test02 {
    public static void main(String[] args) {
        B b = new B();
        // 不存在重写关系
        System.out.println(b.test());
        System.out.println(b.test(2));
    }
}

class A{
    public int test(){
        return 1;
    }
}

class B extends A{
//    public String test(){
//        return "hhh";
//    }
//    private int test(){
//
//    }
//    public int test() throws Exception{
//
//    }
    public int test(int a){
        return a;
    }
}
