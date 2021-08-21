package MyDoubleLinkedList;

/**
 * 自己实现一个双向链表，相当于java.util.LinkedList
 */

public class MyDoubleLinkedList {
    private static class Node {
        Object data;
        Node prev;
        Node next;

        Node(Node prev, Object data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node first;
    private Node last;

    public MyDoubleLinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    public boolean add(Object o) {
        linkLast(o);
        return true;
    }

    private void linkLast(Object o) {
        Node n = new Node(last, o, null);
        if (last != null)
            last.next = n;
        else
            first = n;
        last = n;
        size++;
    }

    private void linkFirst(Object o) {
        Node n = new Node(null, o, first);
        if (first != null)
            first.prev = n;
        else
            last = n;
        first = n;
        size++;
    }

    public int size() {
        return size;
    }

    private Node node(int index) {
        Node tmp = null;
        if (index < (size >> 1)) {
            tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } else {
            tmp = last;
            for (int i = size - 1; i > index; i--) {
                tmp = tmp.prev;
            }
        }
        return tmp;
    }

    public void add(int index, Object o) {
        checkPositionIndex(index);
        if (index == 0) {
            linkFirst(o);
        } else if (index == size) {
            linkLast(o);
        } else {
            Node tmp = node(index);
            Node n = new Node(tmp.prev, o, tmp);
            tmp.prev.next = n;
            tmp.prev = n;
            size++;
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private void checkElementIndex(int index) throws IndexOutOfBoundsException {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkPositionIndex(int index) throws IndexOutOfBoundsException {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void clear() {
        Node tmp = first;
        while (tmp != null) {
            Node tmp2 = tmp.next;
            tmp.prev = null;
            tmp.data = null;
            tmp.next = null;
            tmp = tmp2;
        }
        first = null;
        last = null;
        size = 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    private void removeFirst() {
        Node tmp = first.next;
        first.prev = null;
        first.data = null;
        first.next = null;
        first = tmp;
        tmp.prev = null;
        size--;
    }

    private void removeLast() {
        Node tmp = last.prev;
        last.prev = null;
        last.data = null;
        last.next = null;
        last = tmp;
        tmp.next = null;
        size--;
    }

    public boolean remove(Object o) {
        int i = indexOf(o);
        if (i >= 0) {
            remove(i);
            return true;
        } else {
            return false;
        }
    }

    public Object remove(int index) {
        checkElementIndex(index);
        Object o = null;
        if (index == 0) {
            o = first.data;
            removeFirst();
        } else if (index == size - 1) {
            o = last.data;
            removeLast();
        } else {
            Node tmp = node(index);
            o = tmp.data;
            Node former = tmp.prev;
            Node latter = tmp.next;
            former.next = latter;
            latter.prev = former;
            tmp.prev = null;
            tmp.data = null;
            tmp.next = null;
            size--;
        }
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object[] toArray() {
        Object[] objs = new Object[size];
        int i = 0;
        for (Node tmp = first; tmp != null; tmp = tmp.next) {
            objs[i] = tmp.data;
            i++;
        }
        return objs;
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node tmp = first; tmp != null; tmp = tmp.next) {
                if (tmp.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node tmp = first; tmp != null; tmp = tmp.next) {
                if (o.equals(tmp.data)) {
                    return index;
                }
                index++;
            }
        }
        return index;
    }

    public Object get(int index) {
        checkElementIndex(index);
        return node(index).data;
    }

    public Object set(int index, Object o) {
        checkElementIndex(index);
        Object oo = node(index).data;
        node(index).data = o;
        return o;
    }
}
