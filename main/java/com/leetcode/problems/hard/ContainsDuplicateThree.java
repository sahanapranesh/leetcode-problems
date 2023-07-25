package com.leetcode.problems.hard;

/**
 * You are given an integer array nums and two integers indexDiff and valueDiff.
 *
 * Find a pair of indices (i, j) such that:
 *
 * i != j,
 * abs(i - j) <= indexDiff.
 * abs(nums[i] - nums[j]) <= valueDiff, and
 * Return true if such pair exists or false otherwise.
 */

public class ContainsDuplicateThree {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<= i+indexDiff; j++){
                if(j<nums.length){
                    if(Math.abs(j - i) <= indexDiff &&
                            Math.abs(nums[i] - nums[j]) <= valueDiff) {
                        return true;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1,2,3,1},3,0));
    }
}
