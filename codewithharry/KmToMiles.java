package com.codewithharry;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the distance you want to convert from KM to Miles: ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = km * 0.621;
        System.out.println("Required Result: "+mile+" Miles");
    }
}
