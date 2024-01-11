package com.Placements.Array;

import java.util.Arrays;

public class ReplaceElementByRank {
    static void rank(int[] arr1) {
        int[] newArray = new int[arr1.length];
//        int[] newArray = Arrays.copyOfRange(arr1,0,arr1.length);
        //Copying Elements
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
////            System.out.print(newArray[i]+" ");
       }
        Arrays.sort(newArray);
//        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (newArray[j] == arr1[i]) {
                    arr1[i] = j + 1;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {7,9,8,6};
        rank(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
