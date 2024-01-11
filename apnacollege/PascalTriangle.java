package com.apnacollege;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(num+" ");
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
