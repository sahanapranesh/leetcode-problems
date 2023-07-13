package com.leetcode.problems.medium;

public class MaxVowelsInString {

    public static int maxVowels(String s, int k) {
        int vowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowels++;
            }
        }
        int max = vowels;
        for (int j=k; j < s.length(); j++) {
            if (isVowel(s.charAt(j))) vowels++;
            if (isVowel(s.charAt(j-k))) vowels--;
            max = Math.max(max, vowels);
        }
        return max;
    }

    private static boolean isVowel(char character) {
        return "aeiou".indexOf(character) != -1;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
