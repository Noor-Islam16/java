package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        //Q: Find nth Fibbonacci Number

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Terms: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}

