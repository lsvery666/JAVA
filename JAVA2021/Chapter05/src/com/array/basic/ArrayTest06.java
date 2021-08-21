package com.array.basic;
/*
Arrays工具类
1. 排序   DualQuickSort 双端快速排序算法
    单线程
    Array.sort(a)
    Arrays.sort(a, fromIndex, toIndex)
    多线程
    Arrays.parallelSort(a)
    Arrays.parallelSort(a, fromIndex, toIndex)
    自定义排序规则
    Arrays.sort(a, comparator)
2. 查找
    Arrays.binarySearch()
3. 切片
    Arrays.copyOfRange()

 */

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 7, 1, 0, -1, 3, 4, 9};

        // 排序
        Arrays.sort(a); // 无返回值
        for(int i:a){
            System.out.println(i);
        }

        // 指定范围排序 [fromIndex, toIndex)
        Arrays.sort(a, 1, 10);
        for(int i:a){
            System.out.println(i);
        }

        char[] chs = {'a', 'z', 'f', 'b', 'A'};
        Arrays.sort(chs);
        for(char ch: chs){
            System.out.println(ch);
        }

        float[] floats = {-0.0f, 0.0f, 1.5f, -0.2f, -Float.NaN, Float.NaN, Float.MAX_VALUE, Float.MIN_VALUE};
        Arrays.sort(floats);
        for(float f: floats){
            System.out.println(f);
        }

        // 自定义数据类型的排序
        // 方法一：实现Comparable接口，重写compareTo方法
        Person[] people = {new Person(5), new Person(0), new Person(3)};
        Arrays.sort(people);
        for(Person p: people){
            System.out.println(p);
        }

        // 方法二：自定义一个MyComparator，实现Comparator接口，重写compare方法
        Person[] people2 = {new Person(5), new Person(0), new Person(3)};
        Arrays.sort(people2, new MyComparator());
        for(Person p: people2){
            System.out.println(p);
        }

        int[] b = Arrays.copyOfRange(a, 1, 3);
        for(int i:b){
            System.out.println(i);
        }
    }
}

class MyComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        // o2在前，o1在后
        return Integer.compare(o1.age, o2.age);
    }
}

class Person implements Comparable<Person> {

    Integer age;

    Person(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {

        // p在前，this在后
        return Integer.compare(this.age, p.age);
    }
}
