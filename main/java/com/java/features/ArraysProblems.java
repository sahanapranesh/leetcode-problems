package com.java.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraysProblems {

    public static int[] swapArrayInPlace(int[] numbers){
        IntStream.range(0, numbers.length/2).forEach( i -> {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - i -1];
                numbers[numbers.length - i -1] = temp;
        });
        return numbers;
    }

    public static String findLongestString(String[] names){
        return Arrays.stream(names).max(Comparator.comparing(String::length)).orElse("None present");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapArrayInPlace(new int[]{1, 2, 3, 4, 5})));
        System.out.println(findLongestString(new String[]{"Apple", "Banana", "Avocado"}));
    }
}
