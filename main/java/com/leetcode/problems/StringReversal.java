package com.leetcode.problems;

public class StringReversal {
    public static void reverseString(char[] s) {
        for(int i=0; i<=s.length-1; i++)
        {
            char first = s[i];
            int i1 = s.length - 1 - i;
            char last  = s[i1];
            if(i < i1){
                s[i] = last;
                s[i1] = first;
            }
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
