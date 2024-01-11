package com.Placements.Array;

public class FrequencyofElement {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,10,2,3,4};
        int[] ans = new int[arr.length];
        int n = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    ans[j] = n;
                }
            }
            if(ans[i] != n){
                ans[i] = count;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] != n){
                System.out.println("Frequency of "+arr[i]+" : "+ans[i]);
            }
        }
    }
}
