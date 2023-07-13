package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * Backtracking problem
 */

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        return dfs(nums, 0, new ArrayList(), results);
    }

    public static List<List<Integer>> dfs(int[] nums, int start, List<Integer> tempList, List<List<Integer>> results){
        results.add(new ArrayList(tempList));
        for(int i=start; i<nums.length; i++) {
            tempList.add(nums[i]);
            dfs(nums, i+1, tempList, results);
            tempList.remove(tempList.size() -1);
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
}
