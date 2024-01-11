package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of subjects");
        int sub = in.nextInt();
        double totalGradePoint = 0;
        double totalCreditScore = 0;

        for(int i = 1; i <= sub; i++){
            System.out.println("Enter the Credit Score of "+i+" Subject");
            double x = in.nextDouble();
            System.out.println("Enter the Grade Point of"+i+" Subject");
            double y = in.nextDouble();

            totalCreditScore += x;
            totalGradePoint += x * y;
        }
        double CGPA = totalGradePoint / totalCreditScore;
        System.out.print("The CGPA is: "+CGPA);
    }
}
