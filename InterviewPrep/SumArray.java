package com.InterviewPrep;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}