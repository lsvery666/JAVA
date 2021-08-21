import java.util.ArrayList;
import java.util.List;

/*
内存泄露
1. 长生命周期的对象持有短生命周期对象的引用，尽管短生命周期的对象不再使用，但是因为长生命周期对象持有它的引用而导致不能被回收。
2. 各种连接，如数据库连接、网络连接和IO连接等。当不再使用时，需要调用close方法来释放连接。
3. 如果没有及时地把对象设置为null，很有可能导致内存泄漏的发生。
4. 内部类持有外部类，如果一个外部类的实例对象的方法返回了一个内部类的实例对象，这个内部类对象被长期引用了，即使那个外部类实例对象不再被使用，但由于内部类持有外部类的实例对象，这个外部类对象将不会被垃圾回收，这也会造成内存泄露。
5. 改变哈希值。当一个可变对象被存到HashSet或HashMap中时，如果其哈希值被改变，那么再也无法从集合中remove掉这个对象。

 */

public class Test09 {
    public static void main(String[] args) {
        Person p = new Person("LI");
        List<Person> l = new ArrayList<>();
        l.add(p);
        p = null;
        // 内存泄漏
        System.out.println(l.get(0).name);
    }
}


