package com.leetcode.problems.medium;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 */
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        int startIndex = 0;
        int end =  s.length() -1;
        StringBuilder result =  new StringBuilder();
        for(int i=0; i< numRows; i++) {
            startIndex = i;
            while(startIndex < end){
                result.append(s.charAt(startIndex));
                startIndex = startIndex + numRows + 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
