package com.Placements.Functions;

import java.util.Scanner;

public class MaxMin {
    static int Max(int first,int second, int third){
        int max = first;
        if(second > max){
            max = second;
        }
        if(third > max){
            max = third;
        }
        return max;
    }
    static int Min(int first,int second, int third){
        int min = first;
        if(second < min){
            min = second;
        }
        if(third < min){
            min = third;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = in.nextInt();
        System.out.println("Enter Second Number: ");
        int second = in.nextInt();
        System.out.println("Enter Third Number: ");
        int third = in.nextInt();
        int Max = Max(first,second,third);
        int Min = Min(first,second,third);
        System.out.println("Maximum Number is: "+Max);
        System.out.println("Minimum Number is: "+Min);
    }
}
