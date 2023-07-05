package com.interview.prep.dsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{8, 9, 10, 7, 6, 5};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] nums){
        for(int z=0; z<nums.length; z++){
            for (int j= 1; j < nums.length -z; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
