package com.InterviewPrep;

//Here we are finding the number of occurences of a character in string

import java.util.Scanner;

public class OccurencesOfString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();

        int count = 0;
        char search = 'o';

        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == search){
                count++;
            }
        }
        System.out.println(count);
    }
}
