package com.leetcode.problems.medium.dp;

/**
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int maxLength = 1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(dp[i], maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
