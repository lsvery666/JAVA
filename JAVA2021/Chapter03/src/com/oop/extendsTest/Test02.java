package com.oop.extendsTest;

/*
方法重写（覆盖）的条件：
（1）两个类必须有继承关系，这是前提条件；
（2）重写之后的方法和之前的方法具有相同的返回值类型，相同的方法名，相同的形式参数列表；
（3）重写方法的访问权限不能比之前方法的权限更低；
（4）重写方法的抛出异常不能比之前方法的范围更广。
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws Exception {
        B b = new B();
        System.out.println(b.test());
    }
}

class A{
    protected int test() throws IOException {
        return 1;
    }
}

class B extends A{
//    public String test(){
//        return "hhh";
//    }

//    private int test(){
//        return 2;
//    }

//    int test(){
//        return 2;
//    }

//    public int test() throws Exception{
//        return 2;
//    }

    public int test() throws FileNotFoundException{
        return 2;
    }

}
