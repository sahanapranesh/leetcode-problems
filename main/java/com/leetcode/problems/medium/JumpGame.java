package com.leetcode.problems.medium;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
