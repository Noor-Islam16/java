package com.Placements.Array;


public class SumofArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
