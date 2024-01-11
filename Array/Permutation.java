package com.Placements.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
//        System.out.println("Enter Size of Array");
        /* a = 2 b = 3 n =6
        a = a % (b+n) * n -> 27
        a = a%n -> 2
        b = b%n -> 3
         */
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int[] arr = new int[a];
        int[] arr = {0,2,1,5,3,4};
        int n = arr.length;

        for(int i = 0; i < n; i++){
//            arr[i] = in.nextInt();
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        for(int i = 0; i < n; i++){
            arr[i] = arr[i]/n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
