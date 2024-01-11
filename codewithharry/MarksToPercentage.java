package com.codewithharry;
import java.util.Scanner;

public class MarksToPercentage {
    public static void main(String[] args) {
        double totalsub = 5.0;
        System.out.println("Marks Percentage: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Subject1: ");
        int a = sc.nextInt();
        System.out.println("Enter marks of Subject2: ");
        int b = sc.nextInt();
        System.out.println("Enter marks of Subject3: ");
        int c = sc.nextInt();
        System.out.println("Enter marks of Subject4: ");
        int d = sc.nextInt();
        System.out.println("Enter marks of Subject5: ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Total Marks Obtained: "+sum);
        double mark =  (sum / totalsub);
        System.out.println("Percentage Obtained: "+mark);

    }
}
