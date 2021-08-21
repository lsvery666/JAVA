import java.lang.ref.WeakReference;

/*
弱引用 java.lang.ref.WeakReference
只要垃圾回收机制一运行，不管JVM内容空间是否足够，都会回收该对象占用的内存。
 */
public class Test07 {
    public static void main(String[] args) {
        Object o1 = new Object();
        WeakReference<Object> objectWeakReference = new WeakReference<>(o1);
        System.out.println(o1);
        System.out.println(objectWeakReference.get());

        o1 = null;
        System.gc();

        System.out.println(o1);                         // null
        System.out.println(objectWeakReference.get());  // null

    }
}
