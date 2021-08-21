package Map;

import java.util.HashMap;
import java.util.Map;

/*
HashMap的key可以是null
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map m = new HashMap();

        m.put(null, null);

        System.out.println(m.size());

        m.put(null, 100);

        System.out.println(m.get(null));
        System.out.println(m.size());
    }
}
