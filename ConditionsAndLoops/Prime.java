package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        boolean flag = false;

        int m = 2;
        while (m*m <= n){
            if(n % m == 0){
                flag = true;
                break;
            }
            m++;
        }
        if(!flag){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}
