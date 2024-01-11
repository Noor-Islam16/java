/*
    1
   212
  32123
 4321234
543212345

 */
package com.apnacollege;

import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {

        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //1st half number
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half number
            for(int j =2 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
