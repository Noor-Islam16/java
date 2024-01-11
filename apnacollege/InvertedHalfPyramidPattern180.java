package com.apnacollege;

import java.util.Scanner;

public class InvertedHalfPyramidPattern180 {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){//printing spaces
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){//star print
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

