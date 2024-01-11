package com.codewithharry;

public class ElseIf_18 {
    public static void main(String[] args) {
        int age = 16;
        if (age>=20){
            System.out.println("You are Adult");
        }
        else if(age<=18 && age>=14) {
            System.out.println("Going to Adult");
        }
        else{
            System.out.println("You are not Adult");
        }
    }
}
