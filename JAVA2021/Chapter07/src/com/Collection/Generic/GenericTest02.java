package com.Collection.Generic;
/*
自定义泛型
 */
public class GenericTest02 <anything>{

    public void doSome(anything a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        // new对象的时候指定了泛型是String类型
        GenericTest02<String> t = new GenericTest02<>();

        // 类型不匹配
        // t.doSome(123);

        t.doSome("123");

        // ===================
        GenericTest02<Integer> t2 = new GenericTest02<>();

        t2.doSome(1234);

        // 如果不指定泛型，则视为Object
        GenericTest02 t3 = new GenericTest02();

        t3.doSome(new Student("Tom"));
        t3.doSome("sss");
        t3.doSome(123);
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
