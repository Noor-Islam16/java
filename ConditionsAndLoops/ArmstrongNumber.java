package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int originalNum = n;
        int ans = 0;

        while (originalNum > 0){
            int rem = originalNum % 10;
            ans += rem * rem * rem;
            originalNum /= 10;
        }
        if(ans == n) {
            System.out.println(n +" is Armstrong Number");
        } else {
            System.out.println(n +" is not Armstrong Number");
        }
    }
}
