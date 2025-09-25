package com.leetcode.problems.medium;

import java.util.*;

public class ShortestUncommonSubstring {
    public static String[] shortestSubstrings(String[] arr) {
        String[] answer = new String[arr.length];
        Arrays.fill(answer, "");
        Map<Integer, Set<String>> substringMap = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            substringMap.put(i, new HashSet());
            String current = arr[i];
            Set<String> possibleSubstrings = findPossibleSubstrings(current);
            substringMap.put(i, possibleSubstrings);
        }

        for (int a = 0; a < arr.length; a++) {
            String shortest = "";
            Set<String> possibleSubstrings = substringMap.get(a);
            Set<String> filteredSet = new TreeSet<>(possibleSubstrings);
            for (String substring : possibleSubstrings) {
                for (int x = 0; x < arr.length; x++) {
                    if (x != a) {
                        if (arr[x].contains(substring)) {
                            filteredSet.remove(substring);
                            break;
                        }
                    }
                }
            }
            shortest = filteredSet.stream()
                    .min(new Comparator<>() {
                        @Override
                        public int compare(String o1, String o2) {
                            if(o1.length() < o2.length()){
                                return -1;
                            }else if(o1.length() == o2.length()){
                                return o1.compareTo(o2);
                            }
                            return 1;
                        }
                    }).stream().findFirst().orElse("");
            answer[a] = shortest;
        }
        return answer;
    }

    private static Set<String> findPossibleSubstrings(String current) {
        Set<String> substrings = new HashSet<>();
        for (int y = 0; y < current.length(); y++) {
            for (int z = y; z < current.length(); z++) {
                substrings.add(current.substring(y, z+1));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestSubstrings(new String[]{"gfnt","xn","mdz","yfmr","fi","wwncn","hkdy"})));
    }
}
