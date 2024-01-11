package com.Placements.Array;

public class InversionCount {
    static int[] arr = {8,4,2,1};
    public static int inversion(int n){
        int inv_count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j])
                    inv_count++;
            }
        }
        return inv_count;
    }

    public static void main(String[] args) {
        System.out.println("Number of Inversions: " + inversion(arr.length));
    }
}
