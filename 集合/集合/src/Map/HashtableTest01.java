package Map;

import java.util.Hashtable;
import java.util.Map;

/*
Hashtable的key和value都不能是null
Hashtable的方法都带有synchronized，是线程安全的，效率低，使用较少了
Hashtable的初始化容量是11，默认加载因子是0.75，HashTable扩容之后是：原容量 * 2 + 1
 */
public class HashtableTest01 {
    public static void main(String[] args) {
        Map m = new Hashtable();

        // m.put(null, 100);    // NullPointerException
        // m.put(100, null);    // NullPointerException

    }
}
