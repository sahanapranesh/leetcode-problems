package com.leetcode.problems.easy;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int i=0; i< magazine.length(); i++){
            char currentChar = magazine.charAt(i);
            charMap.put(currentChar, charMap.getOrDefault(currentChar,0)+1);
        }
        for(int i=0; i< ransomNote.length(); i++){
            char currentChar = ransomNote.charAt(i);
            if(charMap.containsKey(currentChar)){
                int count = charMap.get(currentChar);
                if(count > 1){
                    charMap.put(currentChar, count-1);
                }else{
                    charMap.remove(currentChar);
                }
            }
            else{
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}
