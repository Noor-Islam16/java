package com.InterviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//        System.out.print("Enter 1st String: ");
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
        String str1 = "muskan";

//        System.out.print("Enter 2nt String: ");
//        Scanner sr = new Scanner(System.in);
//        String str2 = sr.next();
        String str2 = "nkasum";

        boolean anagram = false;
        if(str1.length() != str2.length()){
            System.out.println(str1 +" and "+str2 + " not anagrams");
        }else{
            char[] anagram1 = str1.toCharArray();
            char[] anagram2 = str2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            anagram = Arrays.equals(anagram1,anagram2);
        }
        if(anagram == true){
            System.out.println("The String is anagram "+str1);
        }else{
            System.out.println(str1 +" and "+str2 + " not anagrams");
        }
    }
}
