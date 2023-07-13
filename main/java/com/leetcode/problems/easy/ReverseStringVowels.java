package com.leetcode.problems.easy;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseStringVowels {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        char[] charArray =  s.toCharArray();
        while(start < end){
            while(start < end && !vowels.contains(charArray[start]+"")){
                start++;
            }
            while(start < end && !vowels.contains(charArray[end]+"")){
                end--;
            }
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }


}
