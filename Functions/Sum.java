package com.Placements.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Q: Take input of two numbers and Print the Sum by Using Functions
        sum();
    }

    static void sum(){

        Scanner in = new Scanner(System.in);
        int a,b;
        float sum;
        System.out.println("Enter two numbers");
        a = in.nextInt();
        b = in.nextInt();
        sum = (float)a/b;  // typecasting
        System.out.println(sum);

    }
}
