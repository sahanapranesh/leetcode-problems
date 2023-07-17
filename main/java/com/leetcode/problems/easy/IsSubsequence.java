package com.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int y = 0;
        for (int z = 0; z < t.length() && y < s.length(); z++) {
            if (t.charAt(z) == s.charAt(y))
                y++;
        }
        return y == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
