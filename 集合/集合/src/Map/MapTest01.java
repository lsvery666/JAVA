package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map：
    1. Map和Collection没有继承关系
    2. Map集合以key和value的方式存储数据：键值对
    3. key和value都是引用数据类型
    4. key值不可以重复，value可以重复
    5. 存储key值相同的键值对，后存的会覆盖先存的
Map接口中常用方法：
    V put(K key, V value)
    V get(Object Key)
    V remove(Object key)
    int size()
    void clear()
    boolean isEmpty()
    boolean containsKey(Object key)
    boolean containsValue(Object value)
    Set<K> keySet()
    Collection<V> values()
    Set<Map.Entry<K, V> entrySet()
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(2, "wangwu");
        m.put(1, "zhangsan");
        m.put(1, "lisi");
        m.put(4, "zhaoliu");
        m.put(3, "zhaoliu");

        System.out.println("=========");

        System.out.println("size: " + m.size());

        System.out.println("=========");

        Collection<String> vs = m.values();
        for(String v: vs){
            System.out.println("value: " + v);
        }

        System.out.println("=========");

        // 遍历方式一：Set<K> keySet()
        for(Integer key: m.keySet()){
            System.out.print("key: " + key);
            System.out.println(", value: "+m.get(key));
        }

        System.out.println("=========");

        /* 遍历方式二：Set<Map.Entry<K, V>> entrySet()
        将Map中的键值对转换成Set，Set中的数据类型是Map.Entry<K, V>，Map.Entry是一个静态内部类
        这种遍历方式效率更高
         */
        Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet){
            // System.out.println(entry);   // 1=lisi, 2=wangwu, ...
            System.out.print("key: " + entry.getKey());
            System.out.println(", value: " + entry.getValue());
        }

        System.out.println("=========");

        m.remove(1);
        for(Object key: m.keySet()){
            System.out.print("key: " + key);
            System.out.println(", value: "+m.get(key));
        }

        System.out.println("=========");
        System.out.println(m.containsKey(1));
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue("wangwu"));

        System.out.println("=========");
        m.clear();
        System.out.println(m.isEmpty());

        System.out.println("=========");
    }
}
