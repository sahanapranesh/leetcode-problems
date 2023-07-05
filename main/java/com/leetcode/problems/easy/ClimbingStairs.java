package com.leetcode.problems.easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n>=0 && n<3){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int x=3; x <= n; x++){
            dp[x] = dp[x-1] + dp[x-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(56));
    }
}
