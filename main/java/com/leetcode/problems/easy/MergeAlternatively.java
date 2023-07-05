package com.leetcode.problems.easy;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 */

public class MergeAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        int counter = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        int limit = Math.min(len1, len2);
        for(int x=0; x< limit; x++){
            result.append(word1.charAt(x));
            result.append(word2.charAt(x));
            counter = x;
        }
        if(len2 > len1){
            result.append(word2, ++counter, word2.length());
        }
        else if(len1 > len2){
            result.append(word1, ++counter, word1.length());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqra"));
    }
}
