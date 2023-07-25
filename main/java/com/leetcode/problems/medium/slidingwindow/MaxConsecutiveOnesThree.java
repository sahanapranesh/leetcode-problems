package com.leetcode.problems.medium.slidingwindow;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class MaxConsecutiveOnesThree {
    public static int longestOnes(int[] nums, int k) {
        int start=0, end=0, zeroes = 0;
        while(end < nums.length){
            if(nums[end] == 0){
                zeroes++;
            }
            end++;
            if(zeroes > k){
                if(nums[start] == 0){
                    zeroes--;
                }
                start++;
            }
        }
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
