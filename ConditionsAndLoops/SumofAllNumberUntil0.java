package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class SumofAllNumberUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, sum = 0;
        do {
            input = sc.nextInt();
            if (input != 0) {
                sum += input;
            }
        } while (input != 0);
        System.out.println("Sum: " + sum);
    }
}