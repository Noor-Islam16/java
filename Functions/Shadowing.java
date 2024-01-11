package com.Placements.Functions;

public class Shadowing {
    static int x = 85;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 127;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
