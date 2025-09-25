package com.leetcode.problems.medium.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, return the number of longest increasing subsequences.
 * Notice that the sequence has to be strictly increasing.
 * Input: nums = [1,3,5,4,7]
 * Output: 2
 * Explanation: The two longest increasing subsequences are [1, 3, 4, 7] and [1, 3, 5, 7].
 */
public class NumberOfLIS {
    public static int findNumberOfLIS(int[] nums) {
        int[] length = new int[nums.length];
        int[] count = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            length[j] = 1;
            count[j] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    length[i] = Math.max(length[i], length[j] + 1);
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
    }
}
