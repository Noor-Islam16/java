package com.Placements.Array;

import java.util.Scanner;

public class RichestCustomerWeath {
    public static void main(String[] args) {
        int wealth = -1;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int row = 0; row < arr.length; row++){
            int sum = 0;
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
                sum += arr[row][col];
            }
            if(sum > wealth){
                wealth = sum;
            }
        }
        System.out.println(wealth);
    }
}
