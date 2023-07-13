package com.leetcode.problems.medium;

import java.util.regex.Pattern;

/**
 * You are given a string s, which contains stars *.
 *
 * In one operation, you can:
 *
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 */
public class RemoveStarsFromString {

    public static String removeStars(String s) {
        int end = s.length();
        if(!s.contains("*")){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i< end; i++){
            if(s.charAt(i) == '*'){
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
            else{
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));

    }
}
