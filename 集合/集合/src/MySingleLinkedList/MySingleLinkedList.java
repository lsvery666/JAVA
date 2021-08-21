package MySingleLinkedList;

/**
 * 自己实现一个单链表
 *
 * @author Li Sen
 */
public class MySingleLinkedList {
    private int size = 0;
    private Node head = null;

    MySingleLinkedList() {
    }

    // Overwrite methods in java.util.Collection
    public void add(Object o) {
        if (size == 0) {
            head = new Node(o);
        } else {
            Node tmp_Node = head;
            while (tmp_Node.next != null) {
                tmp_Node = tmp_Node.next;
            }
            tmp_Node.next = new Node(o);
        }
        size++;
    }

    public boolean remove(Object o) {
        if (o.equals(head.data)) {
            head = head.next;
            size--;
            return true;
        }
        Node tmp = head.next;
        Node last = head;
        while (tmp != null) {
            if (o.equals(tmp.data)) {
                last.next = tmp.next;
                size--;
                return true;
            }
            last = tmp;
            tmp = tmp.next;
        }
        return false;
    }

    public void clear() {
        for (Node n = head; n != null; ) {
            Node nn = n.next;
            n.data = null;
            n.next = null;
            n = nn;
        }
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object o) {
        for (Node tmp = head; tmp != null; tmp = tmp.next) {
            if (o.equals(tmp.data)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object[] toArray() {
        Object[] objs = new Object[size];
        Node tmp = head;
        int i = 0;
        while (tmp != null) {
            objs[i] = tmp.data;
            tmp = tmp.next;
            i++;
        }
        return objs;
    }

    // Overwrite methods in java.util.List
    public void add(int index, Object obj) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            Node n = new Node(obj);
            n.next = head;
            head = n;
            return;
        } else {
            Node tmp = head.next;
            Node last = head;
            int i = 1;
            while (i != index) {
                last = tmp;
                tmp = tmp.next;
                i++;
            }
            Node n = new Node(obj);
            last.next = n;
            n.next = tmp;
        }
        size++;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        int i = 0;
        Node tmp = head;
        while (i != index) {
            tmp = tmp.next;
            i++;
        }
        return tmp.data;
    }

    public int indexOf(Object o) {
        int i = 0;
        Node tmp = head;
        while (tmp != null) {
            if (o.equals(tmp.data)) {
                return i;
            }
            tmp = tmp.next;
            i++;
        }
        return -1;
    }

    public Object remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            Object o = head.data;
            head = head.next;
            size--;
            return o;
        } else {
            int i = 1;
            Node last = head;
            Node cur = head.next;
            while (i != index) {
                last = cur;
                cur = cur.next;
                i++;
            }
            Object o = cur.data;
            last.next = cur.next;
            size--;
            return o;
        }
    }

    public Object set(int index, Object o) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            head.data = o;
        } else {
            int i = 1;
            Node cur = head.next;
            while (i != index) {
                cur = cur.next;
                i++;
            }
            cur.data = o;
        }
        return o;
    }

    private MySingleLinkedList reverse() {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        Object[] objs = toArray();
        for (int i = objs.length - 1; i >= 0; i--) {
            mySingleLinkedList.add(objs[i]);
        }
        return mySingleLinkedList;
    }

    public int lastIndexOf(Object o) {
        MySingleLinkedList reversed = reverse();
        int reversed_index = reversed.indexOf(o);
        return reversed_index != -1 ? (size - 1 -  reversed_index) : -1;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i));
        }
    }

}

class Node {
    Object data;
    Node next;
    public Node(Object data) {
        this.data = data;
    }
}