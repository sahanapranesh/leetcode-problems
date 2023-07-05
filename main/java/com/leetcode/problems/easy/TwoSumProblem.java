package com.leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for(int j=0; j<nums.length; j++){
            if(map.containsKey(target - nums[j])){
                int index = map.get(target - nums[j]);
                result[0] = index;
                result[1] = j;
                break;
            }
            else{
                map.put(nums[j], j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
