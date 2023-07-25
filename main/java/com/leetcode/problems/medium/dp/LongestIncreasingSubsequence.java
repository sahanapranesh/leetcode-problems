package com.leetcode.problems.medium.dp;

/**
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int maxLength = Integer.MIN_VALUE;
        int lis[] =new int[nums.length];
        lis[0] = 1;
        lis[1] = 1;
        for(int x= nums.length-1; x > 0; x--){
            int current = nums[x];
            //lis[x] =
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
