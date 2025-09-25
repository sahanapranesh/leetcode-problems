package com.leetcode.problems.medium;

public class IncreasingTripletSequence {

    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int nextMin = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            } else if (n < nextMin) {
                nextMin = n;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
    }
}
