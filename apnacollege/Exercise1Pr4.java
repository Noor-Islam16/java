package com.apnacollege;

import java.util.Scanner;

public class Exercise1Pr4 {
    public static double circumference(double r){
        double result = 2*3.14*r;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumference(r);
    }
}
