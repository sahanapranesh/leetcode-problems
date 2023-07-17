package com.leetcode.problems.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * We are given an array asteroids of integers representing asteroids in a row.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left).
 * Each asteroid moves at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 */

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int current : asteroids) {
            if (current > 0) {
                stack.push(current);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(current)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(current)) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(current);
                    }
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5,10,-5,-20})));
    }
}
