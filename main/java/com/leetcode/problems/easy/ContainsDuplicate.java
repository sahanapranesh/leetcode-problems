package com.leetcode.problems.easy;

import java.util.HashMap;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap();
        boolean result = false;
        for(int i: nums){
            int counter = count.getOrDefault(i,0);
            count.put(i, ++counter);
            if(counter >= 2){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
