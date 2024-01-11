package com.Placements.ConditionsAndLoops;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = in.nextInt();
        System.out.println("Enter 2nd Number");
        int b = in.nextInt();
        int hcf = 0;
        int lcm = 0;

        for(int i = 1; i <= a || i <= b; i++){
            if( a % i == 0 && b % i == 0){ // 12 % 2 = 0, 16 % 2 = 0 // hcf = 4
                hcf = i;
                lcm = a * b / hcf;
            }
        }
        System.out.println("HCF of the given number is "+hcf);
        System.out.println("LCM of the given number is "+lcm);
    }
}
