package com.apnacollege;

import java.util.Scanner;

public class FactorialusingFunctions {
    public static void factorial(int a){
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i = a; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial is: "+factorial);
    }
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial(a);
    }
}
