package com.InterviewPrep;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int n = 5, first = 0, second = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
}