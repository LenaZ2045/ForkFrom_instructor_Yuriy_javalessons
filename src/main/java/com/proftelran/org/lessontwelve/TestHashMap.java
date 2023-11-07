package com.proftelran.org.lessontwelve;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // hello -> 5
        // world -> 15
        // again -> 30
        // hi -> 10
        // next -> 15
        //      key      value
        map.put("hello", 5);
        map.put("world", 15);
        map.put("again", 30);
        map.put("hi", 10);
        map.put("next", 15);

        printMap(map);
        map.put("again", 2);
        System.out.println();
        printMap(map);
        System.out.println();
        printMapVersionTwo(map);

        Integer value = map.get("world");
        System.out.println("World value in " + value);

        // array table Node<K,V>[] table;
        // "hello" - > hashCode() -> (int, length) - hash -> index in table
        // -> Node -> Node<String,Integer> hello , 5  (if empty in cell)
        // -> iterate Node - > equals "hello" - > Node <String,Integer>

        //change ->

        // get -> "hello" - > hashCode() -> (int, length) - hash -> index in table
        // Node<String,Integer > node - > node.key equals ("hello") -> value


    }

    private static void printMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Pair : key = " + key + " , value = " + value);
        }
    }

    private static void printMapVersionTwo(Map<String, Integer> map) {
        map.forEach((k,v) -> {
            System.out.println("Pair : key = " + k + " , value = " + v);
        });
    }
}
