package com.Placements.Array;

public class MinimumSumofAbsouluteDiff {
    public static void main(String[] args) {
        int result = Integer.MAX_VALUE;
        int[] arr = {2,4,5,3};

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
            result = Math.min(result,sum);
        }
        System.out.println(result);
    }
}
