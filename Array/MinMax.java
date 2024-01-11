package com.Placements.Array;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3,1,5,7,9,11};

        int maxVal = arr[0];
        int minVal = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        System.out.println(maxVal);
        System.out.println(minVal);
    }
}
