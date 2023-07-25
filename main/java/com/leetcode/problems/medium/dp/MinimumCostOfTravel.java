package com.leetcode.problems.medium.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.
 *
 * Train tickets are sold in three different ways:
 *
 * a 1-day pass is sold for costs[0] dollars,
 * a 7-day pass is sold for costs[1] dollars, and
 * a 30-day pass is sold for costs[2] dollars.
 * The passes allow that many days of consecutive travel.
 *
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 */
public class MinimumCostOfTravel {

    public static int mincostTickets(int[] days, int[] costs) {
        int maxDay = days[days.length-1];
        int[] result = new int[maxDay+1];
        Set<Integer> travelDates = new HashSet<>();
        for(int i: days){
            travelDates.add(i);
        }
        for(int i=1; i<=maxDay; i++){
            if(travelDates.contains(i)) {
                int dayPassCost = result[i - 1] + costs[0];
                int weekPassCost = result[Math.max(i - 7, 0)] + costs[1];
                int monthPassCost = result[Math.max(i - 30, 0)] + costs[2];
                result[i] = Math.min(dayPassCost, Math.min(weekPassCost, monthPassCost));
            }
            else{
                result[i] = result[i-1];
            }
        }
        return result[maxDay];
    }

    public static void main(String[] args) {
        System.out.println(mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}));
    }
}
