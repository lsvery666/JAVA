package com.Collection.Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest01 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(1, 5);
        tm.put(0, 8);
        tm.put(5, 9);
        for(Map.Entry<Integer, Integer> kv: tm.entrySet()){
            System.out.println(kv.getKey()+": "+kv.getValue());
        }
        ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList<>(tm.entrySet());
        System.out.println(l.get(1).getKey()+": "+l.get(1).getValue());
    }
}
