package com.leetcode.problems.medium;

/**
 * Given a string word, compress it using the following algorithm:
 * <p>
 * Begin with an empty string comp. While word is not empty, use the following operation:
 * Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
 * Append the length of the prefix followed by c to comp.
 * Return the string comp.
 */
public class StringCompressionThree {
    public static String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0, j = 0;
        while (i < word.length()) {
            char current = word.charAt(i);
            int count = 1;
            j = i + 1;
            while (j < word.length() && current == word.charAt(j)) {
                count++;
                j++;
                if (count == 9) {
                    comp.append(count);
                    comp.append(current);
                    count = 0;
                }
            }
            i = j;
            comp.append(count);
            comp.append(current);
        }
        return comp.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("aaaaaaaaaaaaaabb"));
    }
}
