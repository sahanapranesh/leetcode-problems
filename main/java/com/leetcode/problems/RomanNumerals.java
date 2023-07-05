package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static int romanToInt(String s) {
        Map<String, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put("I", 1);
        romanIntMap.put("II", 2);
        romanIntMap.put("III", 3);
        romanIntMap.put("V", 5);
        romanIntMap.put("X", 10);
        romanIntMap.put("C", 100);
        romanIntMap.put("D", 500);
        romanIntMap.put("M", 1000);
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int currentValue = romanIntMap.get(String.valueOf(s.charAt(i)));
            int nextValue = 0;
            if(i < s.length()-1) {
                nextValue = romanIntMap.get(String.valueOf(s.charAt(i + 1)));
            }
            if(currentValue < nextValue) {
                sum = sum - currentValue;
            }else{
                sum = sum+ currentValue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MXCII"));
    }

}
