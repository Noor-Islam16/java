package com.apnacollege;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<size; i++){
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Largest Number is: "+max);
        System.out.println("Smallest Number is: "+min);
    }
}
