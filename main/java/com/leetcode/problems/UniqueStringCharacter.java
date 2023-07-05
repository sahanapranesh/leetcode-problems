package com.leetcode.problems;

import java.util.*;

public class UniqueStringCharacter {

    public int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        Map<String, List<Integer>> map = new HashMap();
        for(int i=0; i<array.length; i++){
            String a = String.valueOf(array[i]);
            if(map.containsKey(a)){
                map.get(a).add(i);
            }
            else {
                List indices = new ArrayList();
                indices.add(i);
                map.put(a, indices);
            }
        }
        Optional<Map.Entry<String, List<Integer>>> entry = map.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().size() == 1)
                .min(Comparator.comparingInt(entryValue -> entryValue.getValue().get(0)));
        if(entry.isPresent()){
            return entry.get().getValue().get(0);
        }
        return -1;
    }

    public static int firstUniqueCharacter(String s) {
        int index = Integer.MAX_VALUE;
        for ( int i='a'; i< 'z'; i++){
            int curIndex = s.indexOf(i);
            if(curIndex!=-1) {
                if(curIndex == s.lastIndexOf(i)){
                    index =  Math.min(curIndex, index);
                }
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("eetcode"));
    }

}
