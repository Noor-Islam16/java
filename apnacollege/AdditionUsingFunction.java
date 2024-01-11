package com.apnacollege;

import java.util.Scanner;

public class AdditionUsingFunction {
    public static double addition(double a, double b) {
        double sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = addition(a,b);
        System.out.println("Addition of two numbers are: "+sum);
    }
}
