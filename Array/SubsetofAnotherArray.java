package com.Placements.Array;

public class SubsetofAnotherArray {
    static boolean subset(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        for (i = 0; i < arr2.length; i++){
            for (j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j])
                    break;
            }
            if(j == arr1.length)
                return false;
            }
            return true;
        }
    public static void main(String[] args) {
        int[] arr1 = {11, 10,12,21,30,70};
        int[] arr2 = {11,30,70,10};
//        int m = arr1.length;
//        int n = arr2.length;

        if(subset(arr1,arr2))
            System.out.println("arr2[] is subset of arr1[]");
        else
            System.out.println("arr2[] is not a subset of arr1");
    }
}
