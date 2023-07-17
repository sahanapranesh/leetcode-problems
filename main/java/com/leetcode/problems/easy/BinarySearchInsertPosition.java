package com.leetcode.problems.easy;

public class BinarySearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        while(low < high) {
            // Calculate middle index
            int mid = low + (high - low)/2;

            if(target > nums[mid])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }
}
