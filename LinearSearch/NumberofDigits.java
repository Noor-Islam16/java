package com.Placements.LinearSearch;

public class NumberofDigits {
    public static void main(String[] args) {
        int num = 98893;
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
