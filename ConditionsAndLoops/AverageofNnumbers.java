package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class AverageofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value n");
        int n = in.nextInt();
        double sum = 0;

        for(int i = 1; i <= n; i++){
            System.out.println("Enter the "+i+" number ");
            double x = in.nextDouble();
            sum += x;
        }
        double avg = sum / n;
        System.out.println("The average of the number is " +avg);
    }
}
