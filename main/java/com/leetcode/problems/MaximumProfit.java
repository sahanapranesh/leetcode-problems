package com.leetcode.problems;

public class MaximumProfit {

    public static int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int currentProfit, overallProfit = 0;
        for (int i=0; i< prices.length; i++) {
            int currentPrice = prices[i];
            if(currentPrice < leastSoFar){
                leastSoFar = currentPrice;
            }
            currentProfit = currentPrice - leastSoFar;
            if(overallProfit < currentProfit){
                overallProfit = currentProfit;
            }
        }
        return overallProfit;
    }

    public static void main(String[] args) {
        int result = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }

}
