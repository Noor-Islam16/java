package com.apnacollege;

import java.util.Scanner;

public class MultiplyUsingFunctions {
    public static double multiply(double a, double b){
        double product = a * b;
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double product = multiply(a,b);

        System.out.println("The Product of two numbers are: "+product);
    }
}
