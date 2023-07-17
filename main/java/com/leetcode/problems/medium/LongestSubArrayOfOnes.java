package com.leetcode.problems.medium;

/**
 * Given a binary array nums, you should delete one element from it.
 * <p>
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 */

public class LongestSubArrayOfOnes {

    public static int longestSubarray(int[] nums) {
        int left=0, right = 0, maxLength = 0, countOfZeroes = 0;
        int n = nums.length;
        while( right < n){
            if(nums[right] == 0){
                countOfZeroes++;
            }
            while(left < n && countOfZeroes > 1){
                if(nums[left] == 0){
                    countOfZeroes--;
                }
                left++;
            }
            int size = (right - left);
            maxLength = Math.max(maxLength, size);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }
}
