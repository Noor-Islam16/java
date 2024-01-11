/*
 *        *
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 *        *
 */
package com.apnacollege;

import java.util.Scanner;

public class HollowButterflyPattern {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for(int i = 1; i <= n; i++){
            for(int j =1; j<=i; j++){
                //1st half
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd half
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        for(int i = n; i >= 1; i--){
            //1st half
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            //spaces
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd half
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
