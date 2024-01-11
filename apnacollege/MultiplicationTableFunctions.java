package com.apnacollege;

import java.util.Scanner;

public class MultiplicationTableFunctions {
    public static void table(int a){
        for(int i = 1; i <= 10; i++){
            System.out.println(a*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number for Table: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        table(a);
    }
}
