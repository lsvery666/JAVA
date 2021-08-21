package MySingleLinkedList;

public class MySingleLinkedListTest {
    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();

        mySingleLinkedList.add(1);
        mySingleLinkedList.add("hhh");
        mySingleLinkedList.add(new Student("Tom"));

        System.out.println("size:"+ mySingleLinkedList.size());

        mySingleLinkedList.add(3, "aaa");
        mySingleLinkedList.printList();

        System.out.println("========");

        mySingleLinkedList.set(1, "abc");
        mySingleLinkedList.printList();

        System.out.println("========");

        mySingleLinkedList.remove(new Student("Tom"));
        mySingleLinkedList.printList();

        System.out.println("========");

        mySingleLinkedList.remove(2);
        mySingleLinkedList.printList();

        System.out.println("========");

        mySingleLinkedList.add("A");
        mySingleLinkedList.add("B");
        mySingleLinkedList.add("A");
        System.out.println("size:"+ mySingleLinkedList.size());

        System.out.println("=========");

        System.out.println(mySingleLinkedList.contains("A"));

        System.out.println(mySingleLinkedList.indexOf("A"));

        Object[] objs = mySingleLinkedList.toArray();
        for (Object obj : objs) {
            System.out.println(obj);
        }

        System.out.println("==========");

        System.out.println(mySingleLinkedList.lastIndexOf("A"));

        mySingleLinkedList.clear();
        System.out.println(mySingleLinkedList.isEmpty());
    }
}
