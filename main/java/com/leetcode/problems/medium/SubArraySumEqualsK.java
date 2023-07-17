package com.leetcode.problems.medium;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class SubArraySumEqualsK {
    public static int subarraySum1(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int y = 0; y < nums.length; y++) {
            sum += nums[y];
            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sums = new int[nums.length+1];
        sums[0] = 0;
        for(int i=1; i<= nums.length; i++){
            sums[i] = sums[i-1] + nums[i-1];
        }
        for(int z=0; z<sums.length; z++){
            for(int a=z+1; a< sums.length; a++) {
                if(sums[a] - sums[z] == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1}, 2));
    }
}
