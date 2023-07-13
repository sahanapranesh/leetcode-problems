package com.leetcode.problems.easy;

/**
 * A string is good if there are no repeated characters.
 *
 * Given a string s return the number of good substrings of length three in s.
 *
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 *
 * A substring is a contiguous sequence of characters in a string.
 */

public class SubstringsOfFixedSize {
    public static int countGoodSubstrings(String s, int k) {
        int countOfGoodSubstrings = 0;
        int start = 0, end = k, n = s.length();
        while(start < end && end <= n){
            String substring = s.substring(start, end);
            if(isUnique(substring)){
                countOfGoodSubstrings++;
            }
            start++;
            end = start + k;
        }
        return countOfGoodSubstrings;
    }

    private static boolean isUnique(String substring) {
        return substring.charAt(0)!=substring.charAt(1) &&
                substring.charAt(1)!=substring.charAt(2) &&
                substring.charAt(0)!= substring.charAt(2);
    }

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc", 3));
    }

}
