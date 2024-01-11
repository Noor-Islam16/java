package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = in.nextInt();
        double sum = 0;

        for(int i = 1; i <= n; i++){
            System.out.println("Enter the "+i+" number");
            double x = in.nextDouble();
            sum += x;
        }
        System.out.println("The Sum of Numbers are "+sum);
    }
}
