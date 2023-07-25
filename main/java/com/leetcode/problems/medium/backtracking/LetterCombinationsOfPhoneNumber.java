package com.leetcode.problems.medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationsOfPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList();
        if(!digits.isEmpty()) {
            backtrack(results, new StringBuilder(), digits, 0, 0);
        }
        return results;
    }

    private static void backtrack(List<String> results, StringBuilder stringBuilder, String digits, int start, int index) {
        if(stringBuilder.length() == digits.length()){
            results.add(stringBuilder.toString());
            return;
        }
        String value = getDigitLetterMap().get(digits.charAt(start));
        for(int i=index; i<value.length(); i++){
            stringBuilder.append(value.charAt(i));
            backtrack(results, stringBuilder,digits,start+1, index);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    private static Map<Character, String> getDigitLetterMap(){
        HashMap<Character, String> digitLetterMap = new HashMap();
        digitLetterMap.put('2',"abc");
        digitLetterMap.put('3',"def");
        digitLetterMap.put('4',"ghi");
        digitLetterMap.put('5',"jkl");
        digitLetterMap.put('6',"mno");
        digitLetterMap.put('7',"pqrs");
        digitLetterMap.put('8',"tuv");
        digitLetterMap.put('9',"wxyz");
        return digitLetterMap;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
