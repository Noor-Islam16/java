package com.Placements.Array;

// Q: Given an array which consists of only 0, 1 and 2. Sort the array without using any algorithm
import java.util.Arrays;

public class SortZeroOneTwo {
    public static void sortArr(int[] arr){
        int count0 = 0,count1 = 0,count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }

        int i = 0;
        while(count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        while(count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while (count2 > 0){
            arr[i++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,0,2};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
