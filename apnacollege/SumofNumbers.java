package com.apnacollege;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Number You Want a Sum Till: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i=i+1){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
