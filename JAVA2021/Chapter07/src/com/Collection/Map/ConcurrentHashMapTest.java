package com.Collection.Map;

/*
HashMap在多线程环境下的线程安全：
1. Collections.synchronizedMap(Map)
    静态内部类SynchronizedMap，有一个互斥锁final Object mutex，HashMap的所有方法里都加了synchronized(mutex){}
2. Hashtable
    synchronized直接写在了成员方法上，是对this加锁，对数据操作的时候都会上锁，所以效率比较低下。
3. ConcurrentHashMap
    分段锁（segment）技术：前者是分段部分数据锁定。每一把锁用于锁容器其中一部分数据，那么当多线程访问容器里不同数据段的数据时，线程间就不会存在锁竞争，后者是全部锁定
 */

import java.util.Collections;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
    }
}
