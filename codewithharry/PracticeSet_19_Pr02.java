package com.codewithharry;

import java.util.Scanner;

public class PracticeSet_19_Pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3: ");
        m3 = sc.nextInt();

        double avg = (m1+m2+m3) / 3.0;
        System.out.println("Overall Percentage: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You are Passed");
        }
        else{
            System.out.println("You are failed");
        }
    }
}
