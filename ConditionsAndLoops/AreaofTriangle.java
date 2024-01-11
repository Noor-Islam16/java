package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the height and base");
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int b = in.nextInt();
        double a= (h * b)/2;
        System.out.println("The radius is "+ a);
    }
}
