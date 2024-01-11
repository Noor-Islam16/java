package com.Placements.Array;

import java.util.Arrays;

public class MergeTwoSortedArrayWithouExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,4,6,8,9};

        int i = 0, j= 0;
        while(i< arr1.length){
            if(arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                fixArray(arr2);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void fixArray(int[] arr2){
        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] < arr2[i-1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }
        }
    }
}
