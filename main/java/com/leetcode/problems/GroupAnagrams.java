package com.leetcode.problems;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap();

        for(String s: strs){
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);
            if(!results.containsKey(key)){
                results.put(key, new ArrayList());
            }
            results.get(key).add(s);
        }

        return new ArrayList<>(results.values());
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
