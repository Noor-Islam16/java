package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int fact = 1;

        for(int i = n; i>=1; i--){
            fact *= i;
        }
        System.out.print("The factorial of number: "+fact);
    }
}
