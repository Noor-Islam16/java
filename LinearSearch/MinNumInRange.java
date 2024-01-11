package com.Placements.LinearSearch;

public class MinNumInRange {
    static int min(int[]arr,int start,int end){
        int ans = arr[start];
        for (int i = start+1; i < end; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12,43,65,-4,2,1,8,9,85,127};
        int ans = min(arr,1,4);
        System.out.println(ans);
    }
}
