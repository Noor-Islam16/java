package com.codewithharry;
import java.util.Scanner; //For user input

public class TakingInput_05 {
    public static void main(String[] args) {
        System.out.println("Input from User");
        Scanner sc = new Scanner(System.in); //System.in specifies that it reads the input from the sysytem.
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
//        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        float sum = a+b;
        int sum = a+b;
        System.out.println("Sum of these numbers are: "+sum);
//        boolean b = sc.hasNextInt();//It checks the input is integer or not
//        System.out.println(b);
//        String str = sc.nextLine();
//        System.out.println(str);
    }
}