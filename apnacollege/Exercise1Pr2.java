package com.apnacollege;

import java.util.Scanner;

public class Exercise1Pr2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i=i+2){
            sum = sum+i;
            System.out.println(sum);
        }
    }
}
