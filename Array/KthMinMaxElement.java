package com.Placements.Array;

import java.util.Arrays;

public class KthMinMaxElement {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,1,9,8,6};
        int k = 4;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int a = arr[k-1];
        int b = arr[arr.length-k];
        System.out.println("The Smallest "+k+" Element is: "+ a);
        System.out.println("The Largest "+k+" Element is: "+ b);
    }
}
