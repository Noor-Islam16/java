package com.InterviewPrep;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();

        if(yr % 400 == 0)
            System.out.println("Leap Year "+yr);

        else if (yr % 4 == 0 && yr % 100 != 0)
            System.out.println("Leap Year "+yr);

        else
            System.out.println("Not Leap Year "+yr);
    }
}
