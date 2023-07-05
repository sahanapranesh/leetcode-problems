package com.interview.prep.dsa;

public class BinarySearch {

    public static int binarySearch(int x, int low, int high, int[] array){
        while(low <= high){
            int mid = (low+high)/2;
            if(array[mid] == x){
                return mid;
            }
            if(x > array[mid]){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-9,1,3,4,5,6,8,};
        System.out.println(binarySearch(-9, 0, array.length, array));
    }
}
