package com.apnacollege;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a != b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        System.out.println("GCD is: "+b);
    }
}
