package com.Collection.List;

import java.util.LinkedList;

public class StackTest {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println(stack.peek());
    }
}
