package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given a set of distinct houses, determine how many segments are present after each demolition operation
 * A segment is an array of contiguous segments
 */
public class HousesAndSegments {
    public int[] leftoverSegments(int[] houses, int[] queries){
        int result[] = new int[queries.length];
        Arrays.sort(houses);
        HashMap<Integer, Integer> houseMap = new HashMap<>();
        for(int x=0; x< houses.length; x++){
            houseMap.put(houses[x],x);
        }
        for(int z=0; z< queries.length; z++){
            int currentHouse = queries[z];

        }
        return result;
    }
}
