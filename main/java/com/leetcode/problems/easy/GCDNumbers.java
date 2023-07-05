package com.leetcode.problems.easy;

import java.util.Arrays;

public class GCDNumbers {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length-1];
        int first = nums[0];
        for(int i=last; i>0; i--){
            if(first%i == 0 && last%i == 0){
                return i;
            }
        }
        return 1;
    }

    public int findGCDRecursive(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length-1];
        int first = nums[0];
        for(int i=last; i>0; i--){
            if(first%i == 0 && last%i == 0){
                return i;
            }
        }
        return 1;
    }
}
