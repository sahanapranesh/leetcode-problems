package com.leetcode.problems.medium.twopointer;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 *  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right= 0, sum=0;
        int minimumSize = Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right++];
            while(sum >= target){
                minimumSize = Math.min(minimumSize, right-left);
                sum -= nums[left++];
            }
        }
        return minimumSize == Integer.MAX_VALUE? 0: minimumSize;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
