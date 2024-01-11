package com.codewithharry;

import java.util.Scanner;

public class PracticeSet_19_Pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income: ");
        double income = sc.nextDouble();
        if (income<=250000){
            System.out.println("You dont have to pay tax");
        }
        else if (income>250000 && income<=500000){
            double tax1 = 0.05 * (income-250000);
            System.out.println("You have to pay tax of amount: "+ tax1);
        }
        else if (income>500000 && income<=1000000){
            double tax1 = 0.05 * (500000-250000);
            double tax2 = tax1 + 0.2 * (income - 500000);
            System.out.println("You have to pay tax of amount: "+ tax2);
        }
        else{
            double tax1 = 0.05 * (500000-250000);
            double tax2 = tax1 + 0.2 * (1000000 - 500000);
            double tax3 = tax2 + 0.3 * (income - 1000000);
            System.out.println("You have to pay tax of amount: "+ tax3);
        }
    }
}
