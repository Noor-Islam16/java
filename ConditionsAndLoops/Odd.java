package com.Placements.ConditionsAndLoops;

public class Odd {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for(int i = 2; i<=n; i=i+2){
            sum += i;
            System.out.println(i);

        }
        System.out.println("The sum is: "+sum);
    }
}
