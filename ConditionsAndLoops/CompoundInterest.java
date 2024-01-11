package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle");
        int p = in.nextInt();
        System.out.println("Enter Rate of Interest");
        double r =  in.nextDouble();
        System.out.println("Enter Time In Years");
        double t = in.nextDouble();

        double CI = p * Math.pow((1 + r / 100) , t);
        System.out.print("The Compound Interest is: "+CI);
    }
}
