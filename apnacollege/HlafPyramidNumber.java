package com.apnacollege;

import java.util.Scanner;

public class HlafPyramidNumber {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
