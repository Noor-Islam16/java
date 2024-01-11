package com.Placements.Array;

import java.util.Arrays;

public class MinimizetheMaxDiffbwGeights {
    public static int getMinDiff(int[] arr,int n, int k){
        Arrays.sort(arr);

        int result = arr[n-1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        for (int i = 0; i < n-1; i++) {
            int max = Math.max(largest, arr[i]+k);
            int min = Math.min(smallest, arr[i+1]-k);

            result = Math.min(result, max-min);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,10,15};
        int n = arr.length;
        int k = 3;
        int b = getMinDiff(arr,n,k);
        System.out.println("Minimized Diff is: "+ b);
    }
}
