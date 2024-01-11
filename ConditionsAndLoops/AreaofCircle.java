package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double a= 3.14 * r;
        System.out.println("The radius is "+ a);
    }
}
