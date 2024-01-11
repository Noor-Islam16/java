package com.Placements.Array;

import java.util.Scanner;

public class SymmetricPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][2];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++){  //here we take row
            for(int col = 0; col < arr[row].length; col++){  //here we take column
                arr[row][col] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])
                    System.out.println("("+arr[i][0]+","+arr[i][1]+")");
            }
        }

    }
}
