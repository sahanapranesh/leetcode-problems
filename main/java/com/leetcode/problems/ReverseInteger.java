package com.leetcode.problems;

public class ReverseInteger {
    public static int reverse(int x) {
        long reverse= 0;
        while( x != 0){
            reverse= reverse*10 + x % 10;
            System.out.println(reverse);
            x= x/10;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                return 0;
        }
        return (int) reverse;
    }

    public static void main(String[] args) {
        System.out.println(5/10);
        System.out.println(reverse(678));
    }
}
