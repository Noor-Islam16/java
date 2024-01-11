package com.apnacollege;

//Linear Search

import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]=new int[size];

        //input
        System.out.println("Enter Elements of Array");
        for(int i = 0; i<size; i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int x = sc.nextInt();

        //output
        for(int i = 0; i<size; i++){
            if(number[i]==x){
                System.out.println("x found at index: "+i);
            }
        }
    }
}
