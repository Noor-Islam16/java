package com.apnacollege;

import java.util.Scanner;

public class EvenOddFunction {
    public static void evenOdd(int a){
        if(a%2 == 0){
            System.out.println(a+" Is even");
        }
        else{
            System.out.println(a+" Is odd");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        evenOdd(a);
    }
}
