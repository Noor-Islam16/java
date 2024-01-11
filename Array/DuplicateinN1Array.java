package com.Placements.Array;

public class DuplicateinN1Array {
    public static int duplicate(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if(arr[index] < 0)
                return index;
            arr[index] = - arr[index];
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2,3,2};
        int a = duplicate(arr);
        System.out.println("Duplicate number in the array:"+ a);
    }
}
