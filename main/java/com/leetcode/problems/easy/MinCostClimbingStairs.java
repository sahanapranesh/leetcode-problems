package com.leetcode.problems.easy;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
        for( int i=2; i<cost.length; i++){
           cost[i] = cost[i]+ Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
}
