package com.leetcode.problems.easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */

public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> nums1Result = null;
        Set<Integer> nums2Result = new HashSet<>();
        HashMap<Integer, Boolean> commonMap = new HashMap<>();
        for(int num : nums1){
            commonMap.put(num, true);
        }
        for(int num : nums2){
            if(!commonMap.containsKey(num)){
                nums2Result.add(num);
            }else{
                commonMap.put(num, false);
            }
        }
        nums1Result = commonMap.entrySet().stream().filter(Map.Entry::getValue).map(Map.Entry::getKey).collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        result.add(nums1Result);
        result.add(nums2Result.stream().toList());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }
}
