package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.List;

public class MaxVowelsInString {

    public static int maxVowels(String s, int k) {
        int start = 0;
        int end = start + k;
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int maxVowels = Integer.MIN_VALUE;
        while(start < end && end <= s.length()){
            String substring = s.substring(start, end);
            System.out.println(substring);
            int currentVowels = 0;
            for(int y=0; y<substring.length(); y++){
                if(vowels.contains(substring.charAt(y))){
                    currentVowels++;
                }
            }
            maxVowels = Math.max(maxVowels, currentVowels);
            start++;
            end++;
        }
        return maxVowels;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
