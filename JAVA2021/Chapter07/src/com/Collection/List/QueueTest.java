package com.Collection.List;

import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Integer a = queue.pollFirst();
        System.out.println(a);
        System.out.println(queue.size());
    }
}
