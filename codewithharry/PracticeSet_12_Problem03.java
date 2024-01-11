package com.codewithharry;

import java.util.Scanner;

public class PracticeSet_12_Problem03 {
    public static void main(String[] args){
        double b = 85;
        System.out.println("Enter a number(If Output is true than the given number is greater than user input else it is not):");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a>b);

    }
}
