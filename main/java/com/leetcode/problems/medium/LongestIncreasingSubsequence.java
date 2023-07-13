package com.leetcode.problems.medium;

/**
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int longestLength = Integer.MIN_VALUE;
        return longestLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
