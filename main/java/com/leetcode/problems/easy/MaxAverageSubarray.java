package com.leetcode.problems.easy;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage=Double.NEGATIVE_INFINITY;
        double currentSum = 0;
        double currentAvg =0;
        for(int m=0; m<nums.length; m++){
            currentSum = currentSum + nums[m];
            if(m >= k-1){
                currentAvg = currentSum/k;
                maxAverage = Math.max(maxAverage, currentAvg);
                currentSum = currentSum - nums[m-k+1];
            }
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{-5}, 1));
    }
}
