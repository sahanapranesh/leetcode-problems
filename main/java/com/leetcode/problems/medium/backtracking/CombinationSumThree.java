package com.leetcode.problems.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
 *
 * Only numbers 1 through 9 are used.
 * Each number is used at most once.
 * Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
 */
public class CombinationSumThree {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList(),k,n, 1);
        return results;
    }

    private static void backtrack(List<List<Integer>> results, List<Integer> tempList, int size, int target, int start) {
        if(tempList.size() ==size && target == 0){
            results.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<9; i++){
            tempList.add(i);
            backtrack(results, tempList, size, target-i, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}
