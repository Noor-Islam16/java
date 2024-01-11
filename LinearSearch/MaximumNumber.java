package com.Placements.LinearSearch;

public class MaximumNumber {

    //Q: Finding man element in the array
        static int max(int[]arr){
            int ans = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>ans){
                    ans = arr[i];
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] arr = {12,43,65,-4,2,1,8,9,85,127};
            int ans = max(arr);
            System.out.println(ans);
        }
}
