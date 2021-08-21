package Map;
/*
HashMap的key值可以是可变对象吗
可以
 */
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest04 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);

        HashMap<ArrayList<Integer>, String> h = new HashMap<>();
        h.put(a, "a");

        a.add(2);
        // 当key被改变时，它的hashCode也会改变，但它在原HashMap中的位置不会变，所以会导致数据搜索不到了，造成数据丢失
        System.out.println(h.containsKey(a));   // False
    }
}
