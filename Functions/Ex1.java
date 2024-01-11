package com.Placements.Functions;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        int product = 1;

        while(n > 0){
            int rem = n % 10;   //////  n = 4 , rem = 4 % 10 = 4
            n = n / 10; /// n = 4 / 10 = 0
            sum += rem;  /// sum = sum + rem = 3 + 4 = 7
            product *= rem; /// product = product * rem = 2 * 4 = 8

        }

        System.out.println(sum);
        System.out.println(product);
        System.out.println("Subtraction "+ (product - sum));
    }
}
