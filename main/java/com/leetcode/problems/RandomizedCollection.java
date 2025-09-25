package com.leetcode.problems;

import java.util.*;

public class RandomizedCollection {
    private List<Integer> values;
    private HashMap<Integer, Set<Integer>> indexIntMap;

    public RandomizedCollection() {
        indexIntMap = new HashMap();
        values = new ArrayList();
    }

    public boolean insert(int val) {
        boolean response = !indexIntMap.containsKey(val);

        if(response){
            indexIntMap.put(val, new HashSet<>());
        }
        indexIntMap.get(val).add(values.size());
        values.add(val);

        return response;
    }

    public boolean remove(int val) {
        if (!indexIntMap.containsKey(val)) {
            return false;
        }
        Set<Integer> indices = indexIntMap.get(val);
        int indexToBeRemoved = indices.iterator().next();
        if (indices.size() == 1) {
            indexIntMap.remove(val);
        } else {
            indices.remove(indexToBeRemoved);
        }

        int lastIndex = values.size() - 1;
        if (indexToBeRemoved != lastIndex) {
            int lastValue = values.get(lastIndex);
            Set<Integer> lastValIndices = indexIntMap.get(lastValue);
            lastValIndices.add(indexToBeRemoved);
            lastValIndices.remove(lastIndex);
            values.set(indexToBeRemoved, lastValue);
        }
        values.remove(lastIndex);

        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return values.get(random.nextInt(values.size()));
    }

    public static void main(String[] args) {
        RandomizedCollection obj = new RandomizedCollection();
        System.out.println(obj.insert(1));
        System.out.println(obj.insert(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.getRandom());
    }
}
