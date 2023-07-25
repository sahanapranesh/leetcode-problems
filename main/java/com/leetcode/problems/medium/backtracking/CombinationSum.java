package com.leetcode.problems.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency
 *  of at least one of the chosen numbers is different.
 *
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private static void backtracking(List<List<Integer>> results, ArrayList<Integer> tempList, int[] candidates, int target, int start) {
        if(target < 0) {
            return;
        }
        else if (target == 0) {
            results.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtracking(results, tempList, candidates, target - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }
}
