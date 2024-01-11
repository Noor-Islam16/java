package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = in.nextInt();
        int originalNum = n;
        int ans = 0;

        while(originalNum > 0){
            int rem = originalNum % 10;
            originalNum /= 10;
            ans = ans * 10 + rem;
        }
        if(ans == n){
            System.out.println(n +" is Palindrome Number");
        }else {
            System.out.println(n +" is not Palindrome Number");
        }
    }
}
