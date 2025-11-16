package com;

import java.util.stream.Stream;

public class StringReversaltest {

    public String reverse(String input){
        if(input == null){
            throw new RuntimeException("Incorrect input");
        }
        char[] array = input.toCharArray();
        int left = 0;
        int right = input.length()-1;
        while(left < right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(array);
        return new String(array);
    }

//    public static void main(String[] args) {
//        System.out.println(reverse("sahana"));
//    }
}
