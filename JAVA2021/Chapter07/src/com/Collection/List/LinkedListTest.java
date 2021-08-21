package com.Collection.List;

import java.util.LinkedList;
import java.util.List;
/*
LinkedList 底层是双向链表
1. 增
    void push(E e) 添加到头部

    boolean add(E e) 添加到尾部
    void addFirst(E e) 添加到头部
    void addLast(E e) 添加到尾部

    void add(int idx, E e) 添加到指定位置
2. 删
    E pop() 删除头部，为空报异常NoSuchElementException

    E poll() 删除头部，为空返回null
    E pollFirst() 删除头部，为空返回null
    E pollLast() 删除尾部，为空返回null

    E remove()  删除头部，为空报异常NoSuchElementException
    E removeFirst() 删除头部，为空报异常NoSuchElementException
    E removeLast() 删除尾部，为空报异常NoSuchElementException

    E remove(int idx) 删除指定位置，出错报异常
    E remove(Object obj) 删除指定元素，出错报异常
3. 改
    E set(int idx, E e) 返回值为oldValue
4. 查
    E get(int idx) 返回指定位置，会报错IndexOutOfBoundsException
    E getFirst() 返回头部，会报错NoSuchElementException
    E getLast() 返回尾部，会报错NoSuchElementException

    E peek() 返回头部，为空返回null
    E peekFirst() 返回头部，为空返回null
    E peekLast() 返回尾部，为空返回null
*/
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.poll();
        l.pollFirst();
        l.removeLast();
        l.pollLast();
        l.remove();
        l.remove(1);
        l.peek();
        l.peekFirst();
        l.getFirst();
    }
}