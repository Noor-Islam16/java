package com.InterviewPrep;

public class ReverseString {
    public static void main(String[] args) {
        String str = "noor";
        String reverse = "";
        int length = str.length();
        for(int i = 0; i < length; i++){
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}