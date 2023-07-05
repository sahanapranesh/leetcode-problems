package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums1) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (count.get(i) != null && count.get(i) > 0) {
                result.add(i);
                count.put(i, count.get(i) - 1);
            }
        }
        return result.stream().mapToInt(obj -> obj).toArray();
    }
}
