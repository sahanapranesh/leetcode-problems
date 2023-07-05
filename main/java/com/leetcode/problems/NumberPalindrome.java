package com.leetcode.problems;

public class NumberPalindrome {
    public static boolean reverse(int x) {
        long reverse= 0, originalVal = x;
        while( x != 0){
            reverse= reverse*10 + x % 10;
            x= x/10;
        }
        return (int) reverse == originalVal;
    }

    public static void main(String[] args) {
        System.out.println(5/10);
        System.out.println(reverse(5665));
    }
}
