import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/*
虚引用 java.lang.PhantomReference
如果一个对象仅持有虚引用，那么它就和没有任何引用一样，会被GC回收，它不能单独使用也不能通过它访问对象
虚引用必须和引用队列配合使用，当GC释放对象内存时，会将引用加入到引用队列，
如果程序发现某个虚引用被加入到引用队列，那么就可以在所引用的对象被销毁后，进行进一步处理，相当于一种通知机制。
 */
public class Test08 {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person("LiSen");
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Person> pr = new PhantomReference<>(person, referenceQueue);

        System.out.println(person);                 // Person@7ef20235
        System.out.println(pr.get());               // null
        System.out.println(referenceQueue.poll());  // null

        System.out.println("============");
        person = null;
        System.gc();
        Thread.sleep(1000);

        System.out.println(person);                 // null
        System.out.println(pr.get());               // null
        System.out.println(referenceQueue.poll());  // java.lang.ref.PhantomReference@27d6c5e0

    }
}

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
