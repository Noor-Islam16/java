package com.Placements.ConditionsAndLoops;

public class ReverseNumber {

    public static void main(String[] args) {
        //Q: Print Reverse of the Number

        int n = 75863;

        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
