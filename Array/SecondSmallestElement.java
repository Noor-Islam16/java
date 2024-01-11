package com.Placements.Array;


import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,4,1,2,3,4};
        int minVal = arr[0];
        int s_minVal = arr[0];

//        Arrays.sort(arr);
//        System.out.println(arr[1]);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minVal){
                s_minVal = minVal;
                minVal = arr[i];
            } else if (arr[i] < s_minVal) {
                s_minVal = arr[i];
            }
        }
        System.out.println(s_minVal);
    }
}
