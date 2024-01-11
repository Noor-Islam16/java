package com.codewithharry;

import java.util.Scanner;

public class PracticeSet_19_Pr05 {
    public static void main(String[] args) {
        System.out.println("Enter Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year %4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println("Year is Leap: "+year);
        }
        else{
            System.out.println("Year is Not Leap: "+year);
        }
    }
}
