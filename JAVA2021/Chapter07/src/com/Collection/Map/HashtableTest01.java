package com.Collection.Map;

import java.util.Hashtable;
import java.util.Map;

/*
Hashtable的key和value都不能是null
Hashtable的方法都带有synchronized，是线程安全的，效率低，使用较少了
Hashtable的初始化容量是11，默认加载因子是0.75，HashTable扩容之后是：原容量 * 2 + 1
关于为什么Hashtable的key不能是null
我觉得比较靠谱的回答：ConcurrentHashMap和Hashtable都是支持并发的，这样会有一个问题，当你通过get(k)获取对应的value时，如果获取到的是null时，
你无法判断，它是put（k,v）的时候value为null，还是这个key从来没有做过映射。
HashMap是非并发的，可以通过contains(key)来做这个判断。
而支持并发的Map在调用m.contains（key）和m.get(key),m可能已经不同了。
 */
public class HashtableTest01 {
    public static void main(String[] args) {
        Map m = new Hashtable();

        // m.put(null, 100);    // NullPointerException
        // m.put(100, null);    // NullPointerException

    }
}
