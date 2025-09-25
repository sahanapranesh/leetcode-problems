package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    List<Integer> intList;
    HashMap<Integer,Integer> indexValMap;

    public RandomizedSet() {
        intList = new ArrayList();
        indexValMap = new HashMap<>();
    }

    public boolean insert(int val) {
        if (indexValMap.containsKey(val)) {
            return false;
        }
        indexValMap.put(val,intList.size());
        intList.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!indexValMap.containsKey(val)) {
            return false;
        }
        int index = indexValMap.get(val);
        indexValMap.put(intList.get(intList.size()-1), index);
        indexValMap.remove(val);

        intList.set(index, intList.get(intList.size()-1));
        intList.remove(intList.size()-1);

        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return intList.get(random.nextInt(intList.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }

}
