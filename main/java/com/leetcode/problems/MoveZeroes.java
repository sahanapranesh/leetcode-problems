package com.leetcode.problems;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] !=0) {
                if(i!=j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1,9,0,5,7,8,0});
    }
}
