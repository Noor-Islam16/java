/*
 1  1  1  1  1
 2  2  2  2
 3  3  3
 4  4
 5

 */
package com.apnacollege;

import java.util.Scanner;

public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j<=n-i; j++){

                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
