package com.leetcode.problems.easy;

/**
 * Write a program that returns the numbers from N to M both inclusive. But for multiples of three give "Fizz" instead of the number and for the multiples of five give "Buzz".
 * For numbers which are multiples of both three and five, give "FizzBuzz".
 */
public class FizzBuzzProblem {
    public static String run(int N, int M) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */
        String sequence = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = N; i <= M; i++) {
            boolean counted = false;
            if (i % 3 == 0) {
                stringBuilder.append("Fizz");
                counted = true;
            }
            if (i % 5 == 0) {
                stringBuilder.append("Buzz");
                counted = true;
            }
            if(!counted)
                stringBuilder.append(i);
            if (i < M) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(run(1, 15));
    }
}
