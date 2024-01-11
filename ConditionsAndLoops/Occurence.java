package com.Placements.ConditionsAndLoops;

public class Occurence {

    public static void main(String[] args) {
        //Q: Counting the Occurence of Given Numbers

        int n = 8765797;

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
