package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for (int j = 0; j < a.length(); j++) {
            char current = a.charAt(j);
            int curCount = charMap.getOrDefault(current, 0);
            charMap.put(current, ++curCount);
        }
        for (int j = 0; j < b.length(); j++) {
            char current = b.charAt(j);
            if (!charMap.containsKey(current) || charMap.get(current) == 0) {
                return false;
            }
            charMap.put(current, charMap.get(current)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hanah", "hanah"));
    }
}
