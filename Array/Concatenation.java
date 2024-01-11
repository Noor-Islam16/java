package com.Placements.Array;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
