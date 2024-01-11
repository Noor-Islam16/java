package com.apnacollege;

import java.util.Scanner;

//0-1 Triangle
public class PAT_01_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the rows n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
