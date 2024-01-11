package com.apnacollege;

import java.util.Scanner;

public class SolidRectanglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the rows n and columns m: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i--){//rows = outer loops
            for(int j=1; j<=m; j++){//columns = inner lopps
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
