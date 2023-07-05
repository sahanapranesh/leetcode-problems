package com.interview.prep.dsa;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = new int[]{8};
        insertionSort(nums);
    }

    public static void insertionSort(int[] nums){
        for(int z=0; z<nums.length; z++){
            int current = nums[z];
            for(int j = z-1; j>=0; j-- ){
                int prev = nums[j];
                if(prev > current){
                    nums[j] = current;
                    nums[j+1] = prev;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
