package com.leetcode.problems.easy;

public class ConcatIntegers {
    public static int solution(int[] a, int[] b, int k) {
        int tinyPairCount = 0;
        assert(a.length == b.length);
        int s = 0;
        int j = a.length-1;
        while (s < a.length && j >=0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a[s]);
            stringBuilder.append(b[j]);
            if (Integer.parseInt(stringBuilder.toString()) < k) {
                tinyPairCount++;
            }
            s++;
            j--;
        }
        return tinyPairCount;
    }



    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}, new int[]{1,2,3}, 31));
    }
}
