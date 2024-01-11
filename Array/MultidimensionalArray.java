package com.Placements.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++){  //here we take row
            for(int col = 0; col < arr[row].length; col++){  //here we take column
                arr[row][col] = in.nextInt();
            }
        }

        // printing matrix
//        for(int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // enhanced form of the previous for loop

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
