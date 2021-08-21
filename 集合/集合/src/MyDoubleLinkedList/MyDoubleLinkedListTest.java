package MyDoubleLinkedList;

import MySingleLinkedList.Student;

/**
 * 测试自己写的双向链表
 */


public class MyDoubleLinkedListTest {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        // add(Object o)
        myDoubleLinkedList.add("ABC");
        myDoubleLinkedList.add(545);
        myDoubleLinkedList.add("asd");
        myDoubleLinkedList.add("bbb");
        myDoubleLinkedList.add(new Student("Tom"));

        print(myDoubleLinkedList);

        System.out.println("==========");

        // add(int index, Object o)
        // myDoubleLinkedList.add(6, "aaa");
        myDoubleLinkedList.add(5, "aaa");
        myDoubleLinkedList.add(0, 0.9);
        myDoubleLinkedList.add(2, "hhh");
        print(myDoubleLinkedList);

        System.out.println("==========");

        // remove
        myDoubleLinkedList.remove(0);
        myDoubleLinkedList.remove(myDoubleLinkedList.size()-1);
        myDoubleLinkedList.remove(2);
        myDoubleLinkedList.remove(new Student("Tom"));
        print(myDoubleLinkedList);

        System.out.println("==========");

        // set
        myDoubleLinkedList.set(0, "AAA");
        myDoubleLinkedList.set(myDoubleLinkedList.size()-1, 888);
        myDoubleLinkedList.set(2, new Student("Tom"));
        print(myDoubleLinkedList);

        System.out.println("==========");

        // contains
        System.out.println(myDoubleLinkedList.contains(new Student("Tom")));

        System.out.println("==========");

        // indexOf
        System.out.println(myDoubleLinkedList.indexOf(new Student("Tom")));

        System.out.println("==========");

        // clear
        myDoubleLinkedList.clear();

        // isEmpty
        System.out.println(myDoubleLinkedList.isEmpty());
    }

    public static void print(MyDoubleLinkedList l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

}
