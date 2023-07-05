package com.leetcode.problems;

import java.util.Arrays;


public class PlusOneProblem {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--){
           digits[i] = digits[i] + carry;
            if(digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
