package com.leetcode.problems.medium;

import java.util.HashMap;

public class ContiguousArraysContainingPairs {
    public static int solution(int[] a, int m, int k) {
        int result = 0;
        int i = 0;
        while (i <= a.length-m) {
            result += calculatePairs(a, i, i + m, k);
            i++;
        }
        return result;
    }

    static int calculatePairs(int[] a, int startIndex, int endIndex, int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int z = startIndex; z < endIndex; z++) {
            int curValue = a[z];
            int diff = target - curValue;
            if (map.containsKey(diff)) {
                count++;
                break;
            } else {
                map.put(curValue, z);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{15, 8, 8, 2, 6, 4, 1, 7}, 2, 8));
    }


}
