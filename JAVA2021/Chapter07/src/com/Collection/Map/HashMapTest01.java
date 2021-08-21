package com.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/*
HashMap:
    1. HashMap集合底层是哈希表/散列表的数据结构
    2. 哈希表是一个怎样的数据结构呢？
        哈希表是数组和单向链表的结合体。（一维数组，数组中的每个元素是一个单向链表）
        数组：查询效率高，增删效率低
        链表：增删效率高，查询效率低
        哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点
    3. HashMap底层的源代码：
        public class HashMap{
            // HashMap底层首先有一个数组
            Node<K, V>[] table;

            // 静态的内部类HashMap.Node
            static class Node<K, V>{
                final int hash;  // 哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法可以转换成数组的下标）
                final K key;
                V value;
                Node<K, V> next;
            }
        }
    4. map.put(k, v)实现原理：
        第一步：先将k, v封装到Node对象中；
        第二步：底层会调用k的hashCode()方法得出hash值；
        第三步：通过哈希函数/哈希算法，将hash值转换成数组的下标。如果下标位置没有元素，就把Node添加到这个位置上；
        如果下标位置上有链表，此时会拿着k和链表上的每一个Node中的key进行equals。如果所有的equals方法返回都是false，
        那么这个新节点将会被添加到链表的末尾；如果其中有一个equals返回了true，那么这个节点的value将会被覆盖。
    5. map.get(k)实现原理：
        先调用k的hashNode()方法得出哈希值，通过哈希函数/哈希算法转换成数组下标，通过数组下标快速定位到某个位置上，
        如果这个位置上什么也没有，返回null；如果这个位置上有链表，那么会拿着k和单向链表上的每个节点的k进行equals，
        如果所有equals方法返回false，那么get方法返回null，只要其中有一个节点的equals返回true，那么就会返回这个
        节点的value。
    6. 为什么哈希表的增删以及查询效率都很高呢？
        增删是在链表上完成的，查询也不需要全部扫描，只需要部分扫描
    7. 为什么HashMap的key是无序不可重复的？
        无序：因为不一定挂到哪个链表上；不可重复：key的equals方法保证了key的不可重复性
    8. 哈希表中数组上的Node的hash值相异（不同链表上的Node的hash值相异），同一链表上的Node的hash值相同
    9. 假设hashCode()方法返回一个固定值，那么会导致哈希表变成了纯单向链表；假设hashCode()方法返回的值都是不一样的值
       那么会导致哈希表变成了纯一维数组。这种情况称为：散列分布不均匀
        什么是散列分布均匀？
        假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的
    10. 重点：放在HashMap中的key、放在HashSet中的元素需要同时重写hashCode()和equals()方法
    11. HashMap的数组默认初始化容量是16，默认加载因子是0.75
        这个默认加载因子是当HashMap底层数组的容量达到75%时，数组开始扩容，扩容之后的容量是原来的2倍
        HashMap的数组默认初始化容量必须是2的倍数，这是为了达到散列均匀分布所必要的
    12. 在JDK8.0之后，哈希表的单向链表中元素个数超过8个，单向链表这种数据结构会变成红黑树；
        当红黑树上的节点数量小于6时，会重新把红黑树变成单向链表数据结构
    13. 解决冲突：①开放定址法。如线性探测、平方探测；
                ②链接法。链表，java采用这种方法。
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        // 测试HashMap集合key的特点
        // Integer是key，它的hashCode()和equals()方法都已经重写了
        // HashMap<Integer, String> m = new HashMap<>(8);   // 初始化容量设置为8
        Map<Integer, String> m = new HashMap<>();

        m.put(111, "zhangsan");
        m.put(666, "lisi");
        m.put(777, "wangwu");
        m.put(222, "zhaoliu");
        m.put(222, "king");

        System.out.println("size: " + m.size());

        for (Map.Entry<Integer, String> node: m.entrySet()){
            System.out.println(node);
        }

    }
}