package com.leetcode.problems.easy;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int pivotIndex = -1;
        int[] prefixsum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixsum[i] = sum;
        }
        for (int y = 0; y < nums.length; y++) {
            int leftsum = y > 0 ? prefixsum[y - 1] : 0;
            int rightsum = prefixsum[nums.length - 1] - prefixsum[y];
            if (leftsum == rightsum) {
                return y;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
