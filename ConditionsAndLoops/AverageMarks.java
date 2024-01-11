package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total Subjects");
        int sub = in.nextInt();
        int totalMarks = 0;

        for(int i = 1; i <= sub; i++){
            System.out.println("Enter the marks of "+i+" Subject");
            int x = in.nextInt();
            totalMarks += x;
        }
        double average = (double) totalMarks / sub;
        System.out.print("The average of marks: "+average);
    }
}
