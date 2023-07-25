package com.leetcode.problems.easy;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j]
 * and abs(i - j) <= k.
 */
public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<Integer, Integer>();
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(count.containsKey(current)){
                if(Math.abs(count.get(current) - i) <=k){
                    return true;
                }
            }
            count.put(current,i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
