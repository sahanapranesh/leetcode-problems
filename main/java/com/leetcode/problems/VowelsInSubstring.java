package com.leetcode.problems;

public class VowelsInSubstring {
    public static int countVowels(String name){
        int result = 0;
        for(int i=0; i<name.length(); i++){
            if("aeiou".indexOf(name.charAt(i)) >=0){
                result = result + ( i + 1) * (name.length() - i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("my name is sahana"));
    }
}
