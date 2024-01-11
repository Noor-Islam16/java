package com.InterviewPrep;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String reverse = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome: "+str);
        }else{
            System.out.println("Not Palindrome: "+str);
        }
    }
}
