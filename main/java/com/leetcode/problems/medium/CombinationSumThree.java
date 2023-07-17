package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumThree {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        Set<List<Integer>> results = new HashSet();
        int j = 0, l = n - 1;
        int[] nums = new int[n];
        for (int z = 0; z < n; z++) {
            nums[z] = z + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            l = nums.length - 1;
            while (j < l) {
                int sum = nums[i] + nums[j] + nums[l];
                if (sum == n) {
                    results.add(List.of(nums[i], nums[j], nums[l]));
                    j++;
                    l--;
                } else if (sum < k) {
                    j++;
                } else {
                    l--;
                }
            }
        }
        List<List<Integer>> results2 = new ArrayList(results);
        return results2;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,9));
    }
}
