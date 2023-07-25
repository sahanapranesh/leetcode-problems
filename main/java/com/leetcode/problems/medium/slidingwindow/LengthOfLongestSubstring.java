package com.leetcode.problems.medium.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> charSet = new HashSet();
        while (i < s.length()) {
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i++));
                max = Math.max(max, charSet.size());
            } else {
                charSet.remove(s.charAt(j++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdabe"));
    }
}
