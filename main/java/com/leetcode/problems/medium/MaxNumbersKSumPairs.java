package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * You are given an integer array nums and an integer k.
 *
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 *
 * Return the maximum number of operations you can perform on the array.
 */
public class MaxNumbersKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        int operations = 0;
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int curValue = nums[i];
            int key = k-curValue;
            if(numCount.containsKey(key) && numCount.get(key) >0){
                //Found a matching pair
                operations++;
                numCount.put(key, numCount.getOrDefault(key,0)-1);
            }
            else{
                numCount.put(curValue, numCount.getOrDefault(curValue,0)+1);
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }
}
