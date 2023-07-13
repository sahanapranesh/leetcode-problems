package com.leetcode.problems.easy;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int z = 0;
        while (z < flowerbed.length) {
            if (flowerbed[z] == 1) {
                z++;
            } else {
                if (n > 0 && canPlaceFlower(flowerbed, z)) {
                    n--;
                    z = z + 2;
                } else {
                    z++;
                }
            }
        }

        return n == 0;
    }

    private static boolean canPlaceFlower(int[] flowerbed, int z) {
        if (z == 0)
            return flowerbed.length>1 ? flowerbed[z + 1] == 0 : flowerbed[z] == 0;
        else  if (z == flowerbed.length - 1)
            return flowerbed[z - 1] == 0;
        else
            return flowerbed[z - 1] == 0 && flowerbed[z + 1] == 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 1));
    }
}
