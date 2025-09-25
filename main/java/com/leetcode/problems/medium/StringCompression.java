package com.leetcode.problems.medium;

import java.util.Arrays;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * <p>
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead,
 * be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * <p>
 * After you are done modifying the input array, return the new length of the array.
 */
public class StringCompression {
    public static int compress(char[] chars) {
        Arrays.sort(chars);
        int i = 0,j=0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 1;
            while (i < chars.length - 1 && current == chars[i+1]) {
                i++;
                count++;
            }
            chars[j] = current;
            j++;
            if(count>1){
                String value = String.valueOf(count);
                for(int z=0; z<value.length(); z++){
                    chars[j] = value.charAt(z);
                    j++;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(chars));
        return j;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
    }
}
