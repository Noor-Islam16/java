package com.InterviewPrep;

public class Swap {
    public static void main(String[] args) {
        int a = 20, b = 10;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("Numbers are swapped: "+a+" "+b);
    }
}
