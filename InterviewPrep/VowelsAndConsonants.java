package com.InterviewPrep;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowel count is "+vowels);
        System.out.println("Consonant count is "+consonants);
    }
}
