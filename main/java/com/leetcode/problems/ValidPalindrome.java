package com.leetcode.problems;

import java.util.regex.Pattern;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        Pattern pattern = Pattern.compile("[^A-Za-z/d]");
        String input = s.toLowerCase().replaceAll(pattern.pattern(),"").strip();
        char[] array = input.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=input.length()-1; i>=0; i--){
            stringBuffer.append(array[i]);
        }
        return stringBuffer.toString().equals(input);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
