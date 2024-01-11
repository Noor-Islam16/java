package com.codewithharry;

import java.util.Scanner;

public class SwitchCase_18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter AGE: ");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become adult");
            case 23 -> System.out.println("You are become successful");
            case 60 -> System.out.println("Going Retired");
            default -> System.out.println("Enjoy Your Life");
        }
    }
}
