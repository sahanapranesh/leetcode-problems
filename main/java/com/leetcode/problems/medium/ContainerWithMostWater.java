package com.leetcode.problems.medium;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int answer = 0, left = 0, right = height.length-1, result = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                result = height[left] * (right - left);
                left++;
            } else {
                result = height[right] * (right - left);
                right--;
            }
            System.out.println("Left:" +left);
            System.out.println("Right:" +right);
            answer = Math.max(result, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
