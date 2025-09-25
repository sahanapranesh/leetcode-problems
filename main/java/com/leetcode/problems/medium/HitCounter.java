package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HitCounter {
    private Map<Integer,Integer> countMap = new HashMap();

    public HitCounter() {

    }

    public void hit(int timestamp) {
        int current = countMap.getOrDefault(timestamp,0);
        countMap.put(timestamp, current+1);
    }

    public int getHits(int timestamp) {
        int time = timestamp - 300;
        return countMap.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getKey()>time)
                .map(Map.Entry::getValue)
                .reduce(Integer::sum)
                .orElse(0);
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */