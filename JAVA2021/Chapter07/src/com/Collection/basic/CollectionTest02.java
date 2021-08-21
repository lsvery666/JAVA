package com.Collection.basic;
/*
关于java.util.Collection接口中常用的方法
    boolean add(Object e)               向集合中添加元素
    boolean addAll(Collection c)        向集合中添加指定集合的所有元素
    int size()                          获取集合中元素的个数
    void clear()                        清空集合
    boolean contains(Object e)          判断集合是否包含某元素，是通过equals方法判断的
    boolean containsAll(Collection c)   判断集合是否包含指定集合的所有元素
    boolean remove(Object e)            从集合中移除某个元素，移除成功返回true，如果有多个只移除一个
    boolean removeAll(Collection c)     从集合中移除指定集合的所有元素
    boolean retainAll(Collection c)     保留集合中指定集合的所有元素，其他则移除，相当于求交集
    boolean isEmpty()                   判断集合是否为空
    Object[] toArray()                  将集合中的元素转换为一个数组
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
        // 创建一个Collection对象
        // 多态
        Collection c = new ArrayList();

        // 测试Collection接口中的常用方法
        c.add(1200);    // 自动装箱
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);

        // 获取集合中元素的个数
        System.out.println("size:" + c.size());

        // 清空集合
        c.clear();
        System.out.println("size:" + c.size());

        // 再向集合中添加元素
        c.add("hello");
        c.add("world");
        c.add("hhh");
        c.add("sss");
        c.add("hhh");
        System.out.println("size:" + c.size());

        // 判断集合中是否包含某元素
        boolean flag = c.contains("sss");
        System.out.println(flag);

        boolean flag2 = c.contains("sss2");
        System.out.println(flag2);

        // 删除集合中某个元素
        boolean flag3 = c.remove("hhh");
        System.out.println(flag3);
        System.out.println("size:" + c.size());

        // 判断集合是否为空
        System.out.println(c.isEmpty());

        // 将集合转换为数组
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
class Student{}
