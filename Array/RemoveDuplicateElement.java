package com.Placements.Array;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,6,7,8,9};
        int n = arr.length;
        int[] ans = new int[arr.length];
        int j = 0;

        for (int i = 0; i < n-1; i++){

            if(arr[i] != arr[i+1]){
               ans[j++] = arr[i];
            }
        }
        ans[j++] = arr[n-1];

        for(int k = 0; k<j; k++){
            System.out.print(ans[k]+" ");
        }
    }
}
