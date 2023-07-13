package com.leetcode.problems.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0) {
                if(i!=j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1, 0, 5, 0, 3, 4})));
    }
}
