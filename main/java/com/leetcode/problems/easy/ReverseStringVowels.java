package com.leetcode.problems.easy;

import java.util.HashSet;

public class ReverseStringVowels {
    public static String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        HashSet<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('e');
        charSet.add('i');
        charSet.add('o');
        charSet.add('u');
        charSet.add('A');
        charSet.add('E');
        charSet.add('I');
        charSet.add('O');
        charSet.add('U');
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char firstChar = s.charAt(i);
            if(charSet.contains(firstChar)) {
                char lastChar = s.charAt(j);
                if (charSet.contains(lastChar)) {
                    stringBuilder.setCharAt(i, lastChar);
                    i++;
                    j--;
                }
            }
            else{
                i++;
                j--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }


}
