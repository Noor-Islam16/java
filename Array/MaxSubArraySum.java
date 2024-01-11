package com.Placements.Array;

public class MaxSubArraySum {
    public static int maxSub(int[] arr){
        int max = arr[0];
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i], curr_max+arr[i]);
            max = Math.max(max, curr_max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        System.out.println("Maximum Contigiuos Sum 0f Sub Array:  "+maxSub(arr));
    }
}
