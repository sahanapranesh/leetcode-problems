package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majority = nums.length/2;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                if (count.get(num) >= majority) {
                    return num;
                }
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
