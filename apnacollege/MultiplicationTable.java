package com.apnacollege;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter Number You Want Table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}
