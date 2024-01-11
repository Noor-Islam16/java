package com.Placements.Array;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = new int[2 * n];
        int j = 0;

        for(int i = 0; i < 2 * n; i=i+2){
            ans[i] = arr[j];
            ans[i+1] = arr[j+n];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
