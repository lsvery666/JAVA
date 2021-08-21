import java.lang.ref.SoftReference;
import java.util.SortedSet;

/*
软引用 java.lang.ref.SoftReference
当内存充足时它不会被回收，当内存不足时，它会被回收
 */
public class Test06 {
    public static void softRefMemoryEnough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);                     // java.lang.Object@16b98e56
        System.out.println(softReference.get());    // java.lang.Object@16b98e56

        o1 = null;  // o1 = null，保证对象没有强引用指向它了，只有软引用指向它
        System.gc();

        System.out.println(o1);                     // null
        System.out.println(softReference.get());    // java.lang.Object@16b98e56
    }

    public static void softRefMemoryNotEnough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);                     // java.lang.Object@16b98e56
        System.out.println(softReference.get());    // java.lang.Object@16b98e56

        o1 = null;

        try{
            byte[] bytes = new byte[30*1024*1024];
        }catch (Error e){
            e.printStackTrace();
        }finally {
            System.out.println(o1);                     // null
            System.out.println(softReference.get());    // null
        }
    }

    public static void main(String[] args) {
        softRefMemoryNotEnough();
    }

}
