package com.Placements.LinearSearch;

public class MaxIn2DArray {

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
        public static void main(String[] args) {
            int[][] arr = {
                    {23, 14, 3},
                    {44, 85, 5},
                    {127, 89, 34}
            };
            System.out.println(max(arr));
        }
}

