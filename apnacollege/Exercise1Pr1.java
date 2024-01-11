package com.apnacollege;

import java.util.Scanner;

public class Exercise1Pr1 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("Average is: "+avg);
    }
}
