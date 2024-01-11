package com.apnacollege;

import java.util.Scanner;

public class printMyNameusingFunction {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); //function called

    }
}
