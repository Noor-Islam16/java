package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class SubtractProductandSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int sum = 0;
        int product = 1;

        while(n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        int sub = product - sum;
        System.out.println(sub);
    }
}
