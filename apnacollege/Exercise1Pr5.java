package com.apnacollege;

import java.util.Scanner;

public class Exercise1Pr5 {
    public static void age(int a){
        if(a<18){
            System.out.println("You are not Eligible to Vote");
        }else{
            System.out.println("You are Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        age(a);
    }
}
