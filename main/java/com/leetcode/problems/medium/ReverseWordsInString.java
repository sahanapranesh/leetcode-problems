package com.leetcode.problems.medium;

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String input = s.strip();
        String[] words = input.split(" ");
        StringBuilder stringBuffer = new StringBuilder();
        for (int i= words.length-1; i>=0; i--) {
            if(!words[i].isEmpty()) {
                stringBuffer.append(words[i].strip());
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString().strip();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  blue is sky    the"));
    }
}
