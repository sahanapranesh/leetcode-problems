package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 */

public class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countmap = new HashMap<>();
        for (int i : arr) {
            countmap.put(i, countmap.getOrDefault(i, 0) + 1);
        }
        Set<Integer> distinctValues = new HashSet<>(countmap.values());
        return distinctValues.size() == countmap.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,2,1,1,3}));
    }
}
