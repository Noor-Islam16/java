package com.Placements.Array;

import java.util.Arrays;

public class SortArrayAscendDescendOrder {
    public static void main(String[] args) {
        int[] arr = { 89,23,56,77,12,44};
        System.out.println(Arrays.toString(arr));

        //ascending
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
