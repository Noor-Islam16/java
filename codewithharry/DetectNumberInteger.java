package com.codewithharry;

import java.util.Scanner;

public class DetectNumberInteger {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
