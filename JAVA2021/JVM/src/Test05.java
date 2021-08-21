/*
强引用就是我们最常见的普通引用，如 A a = new A()。只要对象还有强引用指向它，即使发生OOM，也不会回收它。
 */

public class Test05 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = o1;

        o1 = null;
        System.gc();

        System.out.println(o1); // null
        System.out.println(o2); // java.lang.Object@16b98e56
    }
}
