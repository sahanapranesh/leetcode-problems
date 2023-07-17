package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {

        Map<Integer, Integer> cache;
        List<Integer> keys = new ArrayList<>();
        int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<Integer, Integer>(capacity);
        }

        public int get(int key) {
            Integer returnVal = -1;
            if(cache.containsKey(key)){
                returnVal = cache.get(key);
                keys.remove((Integer) key);
                keys.add(key);
            }
            return returnVal;
        }

        public void put(int key, int value) {
            if(cache.size() == capacity && !cache.containsKey(key)){
                cache.remove(keys.get(0));
                keys.remove(0);
            }
            cache.put(key, value);
            keys.remove((Integer) key);
            keys.add(key);
        }

    public static void main(String[] args) {
        LRUCache cache1 = new LRUCache(2);
        cache1.put(2,6);
        cache1.get(1);
        cache1.put(1,5);
        cache1.put(1,2);
        System.out.println(cache1.get(1));
        cache1.put(3,3);
        System.out.println(cache1.get(3));
        /*cache1.put(4,4);
        System.out.println(cache1.get(1));
        System.out.println(cache1.get(3));
        System.out.println(cache1.get(4));*/

    }
}
