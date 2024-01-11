package com.apnacollege;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Even Numbers till:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i=i+2){
            System.out.println(i);
        }
    }
}
