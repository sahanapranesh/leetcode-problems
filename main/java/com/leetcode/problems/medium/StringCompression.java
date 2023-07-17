package com.leetcode.problems.medium;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 *
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 *
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead,
 * be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 *
 * After you are done modifying the input array, return the new length of the array.
 */
public class StringCompression {
    public static int compress(char[] chars) {
        int j = 0, i=0;
        while(i < chars.length){
            char current = chars[i];
            int count = 1;
            while(i< chars.length -1 && current == chars[i+1]){
                i++;
                count++;
            }
            chars[j] = current;
            j++;
            if(count > 1) {
                String counter = String.valueOf(count);
                for (int z = 0; z < counter.length(); z++) {
                    chars[j] = counter.charAt(z);
                    j++;
                }
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','a','b','b','a','a'}));
    }
}
