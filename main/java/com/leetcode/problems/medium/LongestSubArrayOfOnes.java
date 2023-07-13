package com.leetcode.problems.medium;

/**
 * Given a binary array nums, you should delete one element from it.
 * <p>
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 */

public class LongestSubArrayOfOnes {

    public static int longestSubarray(int[] nums) {
        int initialLength = 0;
        int z = 0;
        while (z < nums.length) {
            if(nums[z]!=0) {
                initialLength++;
                z++;
            }
            else{
                nums[z] = nums[z+1];
                break;
            }
        }
        int maxLength =  initialLength;
        for(int j=z; j< nums.length-1; j++){
            if(nums[j]==1) {
                initialLength++;
            } else {
                nums[j] = nums[j+1];
            }
            maxLength = Math.max(maxLength, initialLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,0,1,1,1,0}));
    }
}
