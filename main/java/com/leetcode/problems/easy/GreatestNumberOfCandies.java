package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 */

public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = Integer.MIN_VALUE;
        for (int i : candies) {
            greatest = Math.max(greatest, i);
        }
        List<Boolean> results = new ArrayList();
        for (int i : candies) {
            if ((extraCandies + i) >= greatest) {
                results.add(true);
            } else {
                results.add(false);
            }
        }
        return results;
    }
}
